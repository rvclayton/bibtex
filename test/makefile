go    : index
	latex t.tex
	latex t.tex
	bibtex t
	latex t.tex
	latex t.tex
	dvips -f > t.ps t.dvi
	gv t.ps

index :
	cd .. ; make

clean :
	crm ; rm -f *.aux *.ps *.dvi *blg *bbl
