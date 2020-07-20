# Preprocess .bb files to turn them into .bib files, then index the .bib files
# for btxlook.  The new files get put in testdir, which also contains some
# files to check bibtex entries.

testdir		= test

$(testdir)/%.bib: %.bb bibtex.header
		  soelim < $< | sed '/^\./d' > $@

$(testdir)/%.bix: $(testdir)/%.bib
		  cd $(testdir) ; btxindex -w. $*.bib

srcs		= $(basename $(wildcard *bb))

# Generate the index files, which will genereate the bib files.

index		: $(addprefix $(testdir)/, $(addsuffix .bix, $(srcs)))

# Generate the bib files without generating the index files.

bibs		: $(addprefix $(testdir)/, $(addsuffix .bib, $(srcs)))

test		: index
		  make && cd test ; emacs -nw t.tex ; make

see		:
		  cd test ; make
