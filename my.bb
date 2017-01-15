.so bibtex.header

@Book{atamfm,
  author       = "Maureen~F. McHugh",
  title        = "After the Apocalypse",
  publisher    = "Small Beer Press",
  year         = 2011,
  address      = "Easthampton, MA",
  keywords     = "collapse, survival",
  location     = "PS 3563.C3687 A69"
}

@InProceedings{rdlrr,
  author       = "Reia, Rafael and Menezes Leit{\~ a}o, Ant{\' o}nio",
  title        = "Refactoring Dynamic Languages",
  booktitle    = pot # "9th European Lisp Symposium",
  year         = 2016,
  address      = "Krak{\' o}w, Poland",
  month        = "9--10 " # may,
  keywords     = "ides, refactoring tools, novice programming, scheme, racket",
  abstract     = "Typically, beginner programmers do not master the style rules
    of the programming language they are using and, frequently, do not have yet
    the logical agility to avoid writing redundant code.  As a result, although
    their programs might be correct, they can also be improved and it is
    important for the programmer to learn about the improvements that, without
    changing the meaning of the program, simplify it or transform it to follow
    the style rules of the language.  These kinds of transformations are the
    realm of refactoring tools.  However, these tools are typically associated
    with sophisticated integrated development environments (IDEs) that are
    excessively complex for beginners.  In this paper, we present a refactoring
    tool designed for beginner programmers, which we made available in
    DrRacket, a simple and pedagogical IDE.  Our tool provides several
    refactoring operations for the typical mistakes made by beginners and is
    intended to be used as part of their learning process.", 
  location     = "978-2-9557474-0-7", 
  location     = "https://www.youtube.com/watch?v=Sx-6WpiobIU"
}
		  
@Article{erisrp,
  author       = "McKenzie, Bruce~J. and Yeatman, Corey and de Vere, Lorraine",
  title        = "Error Repair in Shift-Reduce Parsers",
  journal      = toplas,
  year         = 1995,
  volume       = 17,
  number       = 4,
  pages        = "672--689",
  month        = jul,
  keywords     = "algorithms, languages, theory, bison, error recovery, least
    cost error recovery, shift-reduce parsers, yacc",
  abstract     = "Local error repair of strings during CFG parsing requires the
    insertion and deletion of symbols in the region of a syntax error to
    produce a string that is error free.  Rather than precalculating tables at
    parser generation time to assist in finding such repairs, this article
    shows how such repairs can be found during shift-reduce parsing by using
    the parsing tables themselves.  This results in a substantial space saving
    over methods that require precalculated tables.  Furthermore, the article
    shows how the method can be integrated with lookahead to avoid finding
    repairs that immediately result in further syntax errors.  The article
    presents the results of experiments on a version of the LALR(1)-based
    parser generator Bison to which the algorithm was added.", 
  location     = "https://doi.org/10.1145/210184.210193"
}

