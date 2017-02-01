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

@Book{scnn,
  author       = "Carl~N. Nightengale",
  title        = "Segregation",
  publisher    = ucp,
  year         = 2012,
  address      = chil,
  keywords     = "segregation, racial politics, city planning, colonialism",
  location     = "HD 7288.75.N54"
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

@Article{dmaahv,
  author       = "Veen, Arthur~H.",
  title        = "Dataflow Machine Architecture",
  journal      = surveys,
  year         = 1986,
  OPTvolume    = 18,
  number       = 4,
  pages        = "365--396",
  month        = dec,
  keywords     = "data-driven architectures, dataflow machines, data structure
    storage, parallel execution, dataflow graphs, iterative and recursive
    constructs, packet communication, code copying, tagged tokens, matching", 
  abstract     = "Dataflow machines are programmable computers of which the
    hardware is optimized for fine-grain data-driven parallel computation.  The
    principles and complications of data-driven execution are explained, as
    well as the advantages and costs of fine-grain parallelism.  A general
    model for a dataflow machine is presented and the major design options are
    discussed.  Most dataflow machines described in the literature are surveyed
    on the basis of this model and its associated technology.  For
    general-purpose computing the most promising dataflow machines are those
    that employ packet-switching communication and support general recursion.
    Such a recursion mechanism requires an extremely fast mechanism to map a
    sparsely occupied virtual space to a physical space of realistic size.  No
    solution has yet proved fully satisfactory.  A working prototype of one
    processing element is described in detail.  On the basis of experience with
    this prototype, some of the objections raised against the dataflow approach
    are discussed.  It appears that the overhead due to fine-grain parallelism
    can be made acceptable by sophisticated compiling and employing special
    hardware for the storage of data structures.  Many computing-intensive
    programs show sufficient parallelism.  In fact, a major problem is to
    restrain parallelism when machine resources tend to get overloaded.
    Another issue that requires further investigation is the distribution of
    computation and data structures over the processing elements.", 
  location     = "https://doi.org/10.1145/27633.28055"
}

@Article{aafmusde,
  author       = "Ben-Shaul, Israel~Z. and Kaiser, Gail~E. and Heineman, George~T.",
  title        = "An Architecture for Multi-User Software Development Environments",
  journal      = cs,
  year         = 1993,
  volume       = 6,
  number       = 2,
  pages        = "65--113",
  month        = "Spring",
  keywords     = "synchronization, task management, data management,
    client-server architecture, transaction and lock management, marvel,
    process modeling, visualization, software development environment",
  abstract     = "We present an architecture for multi-user software
    development environments, covering general, process-centered and rule-based
    MUSDEs.  Our architecture is founded on componentization, with particular
    concern for the capability to replace the synchronization component--to
    allow experimentation with novel concurrency control mechanisms--with
    minimal effects on other components while still supporting integration.
    The architecture has been implemented for the MARVEL SDE, and we report our
    experience replacing and tailoring several parts of the synchronization
    component as part of Marvel", 
  location     = "https://www.usenix.org/publications/compsystems/1993/spr_benshaul.pdf"
}

@Manual{tlt,
  title        = "The \LaTeX{}2HTML Translator",
  author       = "Nikos Drakos",
  organization = "Computer Based Learning Unit, University of Leeds",
  year         = 1996,
  month        = "7 " # jun,
  keywords     = "latex, html, documentation",
  location     = "http://www.latex2html.org/"
}

@TechReport{apapssewm,
  author       = "Ernst~W. Mayr and Richard~J. Anderson and Peter~H. Hochschild", 
  title        = "{A} Programming and Problem-Solving Seminar",
  institution  = csd # "Stanford University",
  year         = 1985,
  number       = "CS-TR-85-1072",
  address      = sca,
  month        = oct,
  keywords     = "integer bricks, scheduling, presburger arithmetic, graphics,
    parallel computation bottelnecks",
  abstract     = "This report contains edited transcripts of the discussions
    held in Stanford's course CS204, Problem Seminar, during winter quarter
    1984.  The course topics consisted of five problems coming from different
    areas of computer science.  The problems were discussed in class and solved
    and programmed by the students working in teams.", 
  location     = "http://i.stanford.edu/TR/CS-TR-85-1072.html"
}

