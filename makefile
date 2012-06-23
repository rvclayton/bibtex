testdir		= test

$(testdir)/%.bib: %.bb bibtex.header
		  soelim < $< | sed '/^\./d' > $@

$(testdir)/%.bix: $(testdir)/%.bib
		  cd $(testdir) ; btxindex -w. $*.bib

srcs		= $(basename $(wildcard *bb))

index		: $(addprefix $(testdir)/, $(addsuffix .bix, $(srcs)))
bibs		: $(addprefix $(testdir)/, $(addsuffix .bib, $(srcs)))

# $Log: makefile,v $
# Revision 1.2  2006-01-08 21:13:36  rclayton
# Changed the test directory.
#
# Revision 1.1.1.1  2006-01-08 19:56:45  rclayton
# Created
