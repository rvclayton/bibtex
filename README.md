bibtex
======

Bibtex databases and related files.

`bibtex.header` &#8212; a file containing string definitions.  The contents of
this file should be included at the head of each .bb file.

`*.bb` &#8212; `.bib` files that use `.so` and `soelim` to include
`bibtex.header` .  There's almost no organization to these files: `oop.bb` is a
collection of papers about teaching object-oriented programming; `my-school.bb`
is a database I used to maintain at school before I discovered unison;
otherwise the databases are roughly chronological.

`permlist` &#8212; a shell script generating a kwik index of paper titles.
