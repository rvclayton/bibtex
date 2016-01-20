.so bibtex.header
		  
@Article{tpspafdolp,
  author       = "Moriconi, Mark and Hare, Dwight~F.",
  title        = "The {PegaSys} System:  Pictures as Formal Documentation of Large Programs",
  journal      = toplas,
  year         = 1986,
  volume       = 8,
  number       = 4,
  pages        = "524--546",
  month        = oct,
  keywords     = "design, documentation, theory, verification, ada, data and
    control dependencies, design hierarchy, graphical formalism, mechanical
    design procedure, programming in the large",
  abstract     = "PegsSys is an experimental system in which a user formally
    describes how a program is put together by means of a hierarchically
    structured collection of pictures, called formal dependency diagrams
    (FDDs).  Icons in an FDD denote a wide range of data and control
    dependencies among the relatively coarse-grained entities contained in
    large programs.  Dependencies considered atomic with respect to one level
    in a hierarchy can be decomposed into a number of dependencies at a lower
    level.  Each dependency can be a predefined primitive of the FDD language
    or it can be defined by a PegaSys user in terms of the primitives.  A
    PegsSys user is given the illusion that logical formulas do not exist, even
    though PegaSys reasons about them internally.  This involves (1) checking
    whether an FDD is meaningful syntactically, (2) determining whether
    hierarchical refinements of an FDD are methodologically sound, and (3)
    deciding whether an FDD hierarchy is logically consistent with the program
    that it is intended to describe.  The techniques used to provide these
    capabilities are discussed along with the logical properties that enable
    PegaSys to maintain the user illusion.", 
  location     = "http://dx.doi.org/10.1145/6465.6478"
}

@Article{edafrcohsn,
  author       = "Bhoedjang, Raoul A.~F. and Verstoep, Kees and R{\" u}hl, Tim and Bal, Henri~E. and Hofman, Rutger F.~H.",
  title        = "Evaluating Design Alternatives for Reliable Communication on High-Speed Networks",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems (ASPLOS IX))",
  year         = 2000,
  volume       = 34,
  number       = 5,
  pages        = "71--81",
  month        = dec,
  keywords     = "network interfaces, parallel programming systems, network
    performance, multicast, reliability, broadcast",
  abstract     = "We systematically evaluate the performance of five
    implementations of a single, user-level communication interface.  Each
    implementation makes different architectural assumptions about the
    reliability of the network hardware and the capabilities of the network
    interface.  The implementations differ accordingly in their division of
    protocol tasks between host software, network-interface firmware, and
    network hardware.  Using microbenchmarks, parallel-programming systems, and
    parallel applications, we assess the performance impact of different
    protocol decompositions.  We show how moving protocol tasks to a relatively
    slow network interface yields both performance advantages and
    disadvantages, depending on the characteristics of the application and the
    underlying parallel-programming system.  In particular, we show that a
    communication system that assumes highly reliable network hardware and that
    uses network-interface support to process multicast traffic performs best
    for all applications.",
  location     = "http://www.cs.cornell.edu/raoul/papers/asplos2000.pdf", 
  location     = "http://dx.doi.org/10.1145/384264.379004"
}

@Article{amfsorfp,
  author       = "Banerjee, Debasish",
  title        = "{A} Methodology for Synthesis of Recursive Functional Programs",
  journal      = toplas,
  year         = 1987,
  volume       = 9,
  number       = 3,
  pages        = "441--462",
  month        = jul,
  keywords     = "programming from example, fp systems, least fixed point,
    recursive programs, program transformation",
  abstract     = "John Backus introduced the Functional Programming (FP)
    system, the variable-free applicative system having reduction semantics.
    Backus has also introduced a unique expansion technique for reasoning about
    a class of recursive FP programs.  As a natural outgrowth of this expansion
    technique, an FP program synthesis methodology is described in this paper.
    The methodology synthesizes recursive FP programs of the form f = p →, q;
    E(f .  h) from their preformulated case-by-case descriptions, which in turn
    come from given input-output example specifications.  After explaining the
    methodology informally, formalization in the form of a definition and a
    synthesis theorem is introduced.  A sufficient condition for the functional
    form E, for successful synthesis under the present methodology, is obtained
    structurally.  Several illustrative examples of synthesis are also
    included.", 
  location     = "http://dx.doi.org/10.1145/24039.24071"
}

@Article{tcoas86,
  author       = "Turchin, Valentin~F.",
  title        = "The Concept of a Supercompiler",
  journal      = toplas,
  year         = 1986,
  volume       = 8,
  number       = 3,
  pages        = "292--325",
  month        = jul,
  keywords     = "program transformation, lazy evaluation, rafel, metasystem
  transition, program optimization, supercompilation, prolog",
  abstract     = "A supercompiler is a program transformer of a certain type.
    It traces the possible generalized histories of computation by the original
    program, and compiles an equivalent program, reducing in the process the
    redundancy that could be present in the original program.  The nature of
    the redundancy that can be eliminated by supercompilation may be various,
    e.g., some variables might have predefined values (as in partial
    evaluation), or the structure of control transfer could be made more
    efficient (as in lazy evaluation), or it could simply be the fact that the
    same variable is used more than once.  The general principles of
    supercompilation are described and compared with the usual approach to
    program transformation as a stepwise application of a number of equivalence
    rules.  It is argued that the language Refal serves the needs of
    supercompilation best.  Refal is formally defined and compared with Prolog
    and other languages.  Examples are given of the operation of a Refal
    supercompiler implemented at CCNY on an IBM/370.", 
  location     = "http://dx.doi.org/10.1145/5956.5957"
}

@Article{tgocp,
  author       = "Carson, Scott~D. and {Reynolds, Jr.}, Paul~F.",
  title        = "The Geometry of Concurrent Programs",
  journal      = toplas,
  year         = 1987,
  volume       = 9,
  number       = 1,
  pages        = "25--53",
  month        = jan,
  keywords     = "deadlock detection, semaphore properties",
  abstract     = "Synchronization errors in concurrent programs are notoriously
    difficult to find and correct.  Deadlock, partial deadlock, and unsafeness
    are conditions that constitute such errors.  A model of concurrent
    semaphore programs based on multidimensional, solid geometry is presented.
    While previously reported geometric models are restricted to two-process
    mutual exclusion problems, the model described here applies to a broader
    class of synchronization problems.  The model is shown to be exact for
    systems composed of an arbitrary, yet fixed number of concurrent processes,
    each consisting of a straight line sequence of arbitrarily ordered
    semaphore operations.", 
  location     = "http://dx.doi.org/10.1145/9758.9759"
}

@Article{eodbms,
  author       = "Fry, James~P. and Sibley, Edgar~H.",
  title        = "Evolution of Data-Base Management Systems",
  journal      = surveys,
  year         = 1976,
  volume       = 8,
  number       = 1,
  pages        = "7--42",
  month        = mar,
  keywords     = "database management, distributed databases, special-purpose
    languages, standards, data definition", 
  abstract     = "This paper deals with the history and definitions common to 
    data-base technology.  It delimits the objectives of data-base management
    systems, discusses important concepts, and defines terminology for use by
    other papers in this issue, traces the development of data-base systems
    methodology, gives a uniform example, and presents some trends and issues.
    Keywords and Phrases: data base, data-base management, data definition,
    data manipulation, generalized processing, data model, data independence,
    distributed data base, data-base machines, data dictionary", 
  location     = "http://dx.doi.org/10.1145/356662.356664"
}

@Book{tlwmg,
  author       = "Martha Grimes",
  title        = "The Lamorna Wink",
  publisher    = "Viking",
  year         = 1999,
  address      = nyny,
  keywords     = "murrdaar, the long arms of the past",
  location     = "PS 3557.R48994 L36"
}

@Book{tgofsothoap,
  author       = "Walter Mosley",
  title        = "The Gift of Fire \slash{} On the Head of a Pin",
  publisher    = "Tor",
  year         = 2012,
  address      = nyny,
  keywords     = "godz, vr",
  location     = "PS 3563.O88456 G54"
}

@Book{fscssbbesg,
  author       = "Simon Goldhill",
  title        = "Freud's Couch, Scott's Buttocks, Bront{\" e}'s Grave",
  publisher    = ucp,
  year         = 2011,
  address      = chil,
  keywords     = "scott, wordsworth, bronte, shakespere, freud, pilgrimages,
    victorians, writer's houses",
  location     = "PR 110.G7 G65"
}

@Book{tyematen,
  author       = "Salman Rushdie",
  title        = "Two Years Eight Months and Twenty-Eight Nights",
  publisher    = "Random House",
  year         = 2015,
  address      = nyny,
  keywords     = "magic, genies, conflict, miscegenation",
  location     = "PR 6068.U757 T96"
}

@Book{tfas,
  author       = "Daniel Kahneman",
  title        = "Thinking, Fast and Slow",
  publisher    = fsg,
  year         = 2011,
  address      = nyny,
  keywords     = "cognition, judgment, reasoning, decision making, risk
    analysis", 
  location     = "BF 441 K238"
}

@Book{spetdg,
  author       = "Philip~E. Tetlock and Dan Gardner",
  title        = "Superforecasters",
  publisher    = "Crown",
  year         = 2015,
  address      = nyny,
  keywords     = "forecasting, estimation, predictions, reasoning",
  location     = "HB 3730 T47"
}

@Book{trmwm,
  author       = "Walter Mosley",
  title        = "The Right Mistake",
  publisher    = "Basic Books",
  year         = 2008,
  address      = nyny,
  keywords     = "bootstrappin'",
  location     = "PS 3563.O88456 R48"
}

@Book{ttpl,
  author       = "Richard~C. Holt and Philip~A. Matthews and J.~Alan Rosselet and James~R. Cordy",
  title        = "The Turing Programming Language",
  publisher    = ph,
  year         = 1988,
  address      = ecnj,
  keywords     = "turing, programming language"
}

