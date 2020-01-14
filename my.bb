.so bibtex.header

@string{asplos87 = sigplan # " (" # pot # "Second International Conference on " # asplos # ", ASPLOS II)"}
@string{icfp02 = sigplan # " (" # pot # "Seventh ACM SIGPLAN International Conference on Functional Programming, ICFP '02)" }
@string{osdi96 = osr # " (" # pot # "Second USENIX Symposium on Operating Systems Design and Implementation, OSDI '96)"}
@string{ppeals88 = sigplan # " (" # pot # "ACM\slash SIGPLAN Conference on Parallel Programming: Experience with Applications, Languages and Systems, PPEALS '88)"}
@string{sosp89    = osr # " (" # pot # "Twelfth" # sosp # ", SOSP '89)"}
@string{sosp91    = osr # " (" # pot # "Thirteenth" # sosp # ", SOSP '91)"}
@string{sosp93    = osr # " (" # pot # "Fourteenth" # sosp # ", SOSP '932)"}
@string{usenixs89 = pot # "Summer 1989 USENIX Conference"}
@string{usenixs92 = pot # "Summer 1992 USENIX Technical Conference"}
@string{usenixs93 = pot # "Summer 1993 USENIX Technical Conference"}
@string{usenixw89 = pot # "Winter 1989 USENIX Conference"}
@string{usenixw90 = pot # "Winter 1990 USENIX Conference"}
@string{usenixw91 = pot # "Winter 1991 USENIX Conference"}
@string{usenixw93 = pot # "Winter 1993 USENIX Conference"}
		  
		  
@Book{tcwekm,
  author       = "Ella~K. Maillart",
  title        = "The Cruel Way",
  subtitle     = "Switzerland to Afghanistan in a Ford, 1939",
  publisher    = ucp,
  year         = 2013,
  address      = chil,
  keywords     = "travel, middle east",
  location     = "DS 352.M18"
}

@Book{taeojl,
  author       = "Yves Beauchemin",
  title        = "The Accidental Education of Jerome Lupien",
  publisher    = "House of Anansi Press",
  year         = 2018,
  address      = "Canada",
  keywords     = "political machinations, lobbyists, con games",
  location     = "PS 8553.E172 E4813"
}

@Book{himt,
  author       = "Matt Taibbi",
  title        = "Hate Inc.",
  publisher    = "OR Books",
  year         = 2019,
  address      = nyny,
  keywords     = "media, propaganda, chomsky, maddow, journalism, the profit motive",
  location     = "9781949017250"
}

@Book{eolp,
  author       = "Christopher John Hogger",
  title        = "Essentials of Logic Programming",
  publisher    = oup,
  year         = 1990,
  series       = "Graduate Texts in Computer Science",
  address      = nyny,
  keywords     = "logic programming, first-order logic, causal-form logic,
    herbrand domain, sld resolution, definite program semantics, finite
    failure, program verification",
  location     = "QA 76.63 H64"
}

@Article{famw,
  author       = "Charles~P. Thacker and Lawrence~C. Stewart",
  title        = "Firefly:  {A} Multiprocessor Workstation",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "164--172",
  month        = oct,
  keywords     = "multiprocessor architecture, vax, caching, trade-offs,
    simulation",
  abstract     = "Firefly is a shared-memory multiprocessor workstation that
    contains from one to seven MicroVAX 78032 processors, each with a floating
    point unit and a sixteen kilobyte cache.  The caches are coherent, so that
    all processors see a consistent view of main memory.  A system may contain
    from four to sixteen megabytes of storage.  Input-output is done via a
    standard DEC QBus.  Input-output devices are an Ethernet controller, fixed
    disks, and a monochrome 1024 x 768 display with keyboard and mouse.
    Optional hardware includes a high resolution color display and a controller
    for high capacity disks.  Figure 1 is a system block diagram.The Firefly
    runs a software system that emulates the Ultrix system call interface.  It
    also supports medium- and coarse-grained multiprocessing through multiple
    threads of control in a single address space.  Communications are
    implemented uniformly through the use of remote procedure calls.This paper
    describes the goals, architecture, implementation and performance analysis
    of the Firefly.  It then presents some measurements of hardware
    performance, and discusses the degree to which SRC has been successful in
    producing software to take advantage of multiprocessing.", 
  location     = "https://doi.org/10.1145/36177.36199", 
  location     = "https://www.hpl.hp.com/techreports/Compaq-DEC/SRC-RR-23.html"
}

@Article{paritv8p,
  author       = "Douglas~W. Clark",
  title        = "Pipelining and Performance in the {VAX} 8800 Processor",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "173--177",
  month        = oct,
  keywords     = "pipelining, microcode, micropipelining, instruction set
    architecture, performance", 
  abstract     = "The VAX 8800 family (models 8800, 8700, 8550), currently the
    fastest computers in the VAX product line, achieve their speed through a
    combination of fast cycle time and deep pipelining.  Rather than pipeline
    highly variable VAX instructions as such, the 8800 design pipelines uniform
    microinstructions whose addresses are generated by instruction unit
    hardware.  This design approach helps achieve a fast cycle time, which is
    the prime determinan of performance.  Some preliminary measurements of
    cycles per average instruction are reported.", 
  location     = "https://doi.org/10.1145/36177.36200"
}

@Article{avafatsc,
  author       = "Robert~P. Colwell and Robert~P. Nix and John~J. O'Donnell and David~B. Papworth and Paul~K. Rodman",
  title        = "{A} {VLIW} Architecture for a Trace Scheduling Compiler",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "180--192",
  month        = oct,
  keywords     = "vliw architecture, pipelining, compilation, trace scheduling,
    scientific computation, instruction set architecture, branching",
  abstract     = "Very Long Instruction Word (VLIW) architectures were promised
    to deliver far more than the factor of two or three that current
    architectures achieve from overlapped execution.  Using a new type of
    compiler which compacts ordinary sequential code into long instruction
    words, a VLIW machine was expected to provide from ten to thirty times the
    performance of a more conventional machine built of the same implementation
    technology.Multiflow Computer, Inc., has now built a VLIW called the TRACE
    along with its companion Trace Scheduling compacting compiler.  This new
    machine has fulfilled the performance promises that were made. Using many
    fast functional units in parallel, this machine extends some of the basic
    Reduced-Instruction-Set precepts: the architecture is load/store, the
    microarchitecture is exposed to the compiler, there is no microcode, and
    there is almost no hardware devoted to synchronization, arbitration, or
    interlocking of any kind (the compiler has sole responsibility for runtime 
    resource usage).  This paper discusses the design of this machine and
    presents some initial performance results.", 
  location     = "https://doi.org/10.1145/36206.36201"
}

@Article{dttstcplitcm,
  author       = "David~R. Ditzel and Hubert~R. McLellan and Alan~D. Berenbaum",
  title        = "Design Tradeoffs to Support the {C} Programming Language in the {CRISP} Microprocessor",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "158--162",
  month        = oct,
  keywords     = "system architecture, language support, context switching,
    code density, stack cache, compiler support, code analysis, path length",
  abstract     = "The CRISP Microprocessor contains a number of new
    architectural features to achieve high performance and support the C
    programming language.  The instruction set was designed to be independent
    of architectural tradeoffs used in any single implementation.  This paper
    describes the particular tradeoffs used in the implementation of a 172,163
    transistor 32-bit single chip microprocessor.  Many tradeoffs were used in
    the design of CRISP, this paper tries to focus on those particular to C. ", 
  location     = "https://doi.org/10.1145/36177.36198"
}

@Article{arafsc,
  author       = "Richard~B. Kieburtz",
  title        = "{A} {RISC} Architecture for Symbolic Computation",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "146--155",
  month        = oct,
  keywords     = "graph reduction, combinators, g-machines, tagged data types,
    pipelining",
  abstract     = "The G-machine is a language-directed processor architecture
    designed to support graph reduction as a model of computation.  It can
    carry out lazy evaluation of functional language programs and can evaluate
    programs in which logical variables are used.  To support these language
    features, the abstract machine requires tagged memory and executes some
    rather complex instructions, such as to evaluate a function
    application.This paper explores an implementation of the G-machine as a
    high performance RISC architecture.  Complex instructions can be
    represented by RISC code without experiencing a large expansion of code
    volume.  The instruction pipeline is discussed in some detail.  The
    processor is intended to be integrated into a standard, 32-bit memory
    architecture.  Tagged memory is supported by aggregating data with tags in
    a cache.", 
  location     = "https://doi.org/10.1145/36177.36180"
}

@Article{rvcfpacs,
  author       = "Gaetano Borriello and Andrew~R. Cherenson and Peter Bernard Danzig and Michael Newell Nelson",
  title        = "{RISCs} vs. {CISCs} for {Prolog}: {A} Case Study",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "136--145",
  month        = oct,
  keywords     = "prolog, logic programming, abstract machines, compilation,
    spur, tagged data types, unification, backtracking, coprocessors",
  abstract     = "This paper compares the performance of executing compiled
    Prolog code on two different architectures under development at
    U. C. Berkeley.  The first is the PLM, a special-purpose CISC architecture
    intended as a coprocessor for a host machine.  The second is SPUR, a
    general-purpose RISC architecture that supports tagged data.  Fourteen
    standard benchmark programs were run on both the PLM and SPUR simulators.
    The compiled code for SPUR was obtained by simple macro-expansion of PLM
    code generated by the PLM Prolog compiler.  The two implementations are
    compared with regard to static and dynamic program size, execution speed,
    and memory system performance.  On average, the macrocoded SPUR
    implementation has a static code size 14 times larger than the PLM,
    executes 16 times more instructions, yet requires only 2.3 times the number
    of machine cycles (or has the performance of 0.43 PLMs).  When memory
    system performance is taken into account, SPUR is equivalent to 0.29 PLMs.
    Optimizations of the macro-expanded code and minor architectural changes to
    SPUR would increase this ratio to 0.53, or 0.60 for the largest benchmarks.
    Thus a tagged RISC architecture can execute Prolog at least half as fast as
    a special-purpose CISC architecture for Prolog.", 
  location     = "https://doi.org/10.1145/36177.36196"
}

@Article{tmeuailatmd,
  author       = "David~W. Wall and Michael~L. Powell",
  title        = "The {Mahler} Experience:  Using an Intermediate Language as the Machine Description",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "100--104",
  month        = oct,
  keywords     = "intermediate language, machine independence, compilers,
    global optimizations, link-time optimizations, instruction scheduling,
    pipelining, abstract machines",
  abstract     = "Division of a compiler into a front end and a back end that 
    communicate via an intermediate language is a well-known technique.  We go
    farther and use the intermediate language as the official description of a
    family of machines with simple instruction sets and addressing
    capabilities, hiding some of the inconvenient details of the real machine
    from the users and the front end compilers.To do this credibly, we have had
    to hide not only the existence of the details but also the performance
    consequences of hiding them.  The back end that compiles and links the
    intermediate language tries to produce code that does not suffer a
    performance penalty because of the details that were hidden from the front
    end compiler.  To accomplish this, we have used a number of link-time
    optimizations, including instruction scheduling and interprocedural
    register allocation, to hide the existence of such idiosyncracies as
    delayed branches and non-infinite register sets.  For the most part we have
    been successful.", 
  location     = "https://doi.org/10.1145/36177.36190",
  location     = "https://www.hpl.hp.com/techreports/Compaq-DEC/WRL-87-1.pdf"
}

@Article{asosctfps,
  author       = "Shlomo Weiss and James~E. Smith",
  title        = "{A} Study of Scalar Compilation Techniques for Pipelined Supercomputers",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "105--109",
  month        = oct,
  keywords     = "cray computers, loop unrolling, software pipelining,
    performance, scientific computing, optimization, machine architectures,
    register files, vectorization",
  abstract     = "This paper studies two compilation techniques for enhancing
    scalar performance in high-speed scientific processors: software pipelining
    and loop unrolling.  We study the impact of the architecture (size of the
    register file) and of the hardware (size of instruction buffer) on the
    efficiency of loop unrolling.  We also develop a methodology for
    classifying software pipelining techniques.  For loop unrolling, a
    straightforward scheduling algorithm is shown to produce near-optimal
    results when not inhibited by recurrences or memory hazards.  Our study
    indicates that the performance produced with a modified CRAY-1S scalar
    architecture and a code scheduler utilizing loop unrolling is comparable to
    the performance achieved by the CRAY-1S with a vector unit and the CFT
    vectorizing compiler.", 
  location     = "https://doi.org/10.1145/79505.79508"
}

@Article{cs8tar,
  author       = "William~R. Bush and A.~Dain Samples and David Ungar and Paul~N. Hilfinger",
  title        = "Compiling {Smalltalk-80} to a {RISC}",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "105--109",
  month        = oct,
  keywords     = "risc architecture, bytecode, compilation, register windows,
    soar, dynamic languages, caching, performance",
  abstract     = "The Smalltalk On A RISC project at U.  C.  Berkeley proves
    that a high-level object-oriented language can attain high performance on a
    modified reduced instruction set architecture.  The single most important
    optimization is the removal of a layer of interpretation, compiling the
    bytecoded virtual machine instructions into low-level, register-based,
    hardware instructions.  This paper describes the compiler and how it was
    affected by SOAR architectural features.  The compiler generates code of
    reasonable density and speed.  Because of Smalltalk-80's semantics,
    relatively few optimizations are possible, but hardware and software
    mechanisms at runtime offset these limitations.  Register allocation for an
    architecture with register windows comprises the major task of the
    compiler.  Performance analysis suggests that SOAR is not simple enough;
    several hardware features could be efficiently replaced by instruction
    sequences constructed by the compiler.", 
  location     = "https://doi.org/10.1145/36177.36192"
}

@Article{hmamae,
  author       = "F.~Chow and S.~Correll and M.~Himelstein and E.~Killian and L.~Weber",
  title        = "How Many Addressing Modes are Enough?",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "117--121",
  keywords     = "risc, addressing modes, addressing architecture, offset
    indexing, optimizations, performance, simplicity",
  abstract     = "Programs naturally require a variety of memory-addressing
    modes.  It isn't necessary to provide them in hardware, however, if a
    compiler can synthesize them from a few primitive modes.  This not only
    simplifies the hardware, but also permits the compiler to use its
    understanding of the program to economize on the modes which it uses.  We
    present some compilation techniques that allow the compiler to deal
    effectively with a single addressing mode in a target RISC processor.  We
    also give measurements to show the benefits of such techniques, and to
    support our assertion that a single addressing mode is adequate for a
    general purpose processor, provided that mode incorporates both a pointer
    and an offset.", 
  location     = "https://doi.org/10.1145/36177.36193"
}

@Article{salatsp,
  author       = "Henry Massalin",
  title        = "Superoptimizer --- {A} Look at the Smallest Program",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "122--126",
  keywords     = "optimization, exhaustive search, probabilistic testing,
    assembly code",
  abstract     = "Given an instruction set, the superoptimizer finds the
    shortest program to compute a function.  Startling programs have been
    generated, many of them engaging in convoluted bit-fiddling bearing little
    resemblance to the source programs which defined the functions.  The key
    idea in the superoptimizer is a probabilistic test that makes exhaustive
    searches practical for programs of useful size.  The search space is
    defined by the processor's instruction set, which may include the whole
    set, but it is typically restricted to a subset.  By constraining the
    instructions and observing the effect on the output program, one can gain
    insight into the design of instruction sets.  In addition, superoptimized
    programs may be used by peephole optimizers to improve the quality of
    generated code, or by assembly language programmers to improve manually
    written code.", 
  location     = "https://doi.org/10.1145/36177.36194"
}

@Article{paaeotpm,
  author       = "Kazuo Taki and Katsuto Nakajima and Hiroshi Nakashima and Morihiro Ikeda",
  title        = "Performance and Architectural Evaluation of the {PSI Machine}",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "128--135",
  keywords     = "kl0, prolog, logic programming, caching, branching, psi machine",
  abstract     = "We evaluated a Prolog machine PSI (Personal Sequential
    Inference machine) for the purpose of improving and redesigning it.  In
    this evaluation, we measured the execution speed and the dynamic
    characteristics of cache memory, register file, and branching hardware
    introduced for high-speed execution of Prolog programs.Execution speed of
    the PSI firmware interpreter was found to be comparable to that of the
    DEC-10 Prolog compiled code on the DEC-2060.  It was also found that PSI
    was faster than DEC for executing programs containing much unification and
    backtracking that require runtime processing.With the cache memory, the hit
    ratio for application programs was found higher than 96%; this demonstrates
    that the Prolog execution has much memory access locality.  The memory
    access frequency and the appearance ratio between Read and Write command
    were also investigated.Concerning the register file, use rate of each
    dedicated access mode was measured and effect of each mode was discussed.
    In the branching function we confirmed a high appearance rate of
    conditional branches and multi-way branches based on tag values.", 
  location     = "https://doi.org/10.1145/36177.36195"
}

@Article{cbatccaisohci,
  author       = "Sam Wineburg and Susan Mosborg and Dan Porat and Ariel Duncan",
  title        = "Common Belief and the Cultural Curriculum:  An Intergenerational Study of Historical Consciousness",
  journal      = "American Education Research Journal",
  year         = 2007,
  volume       = 44,
  number       = 1,
  pages        = "40--76",
  month        = mar,
  keywords     = "history instruction, collective memory, vietnam war, united
    states history, curricula, veterans, soldiers, student protests, political
    protests, textbooks, forest gump",
  abstract     = "How is historical knowledge transmitted across generations?
    What is the role of schooling in that transmission? The authors address
    these questions by reporting on a thirty-month longitudinal study into how
    home, school, and larger society served as contexts for the development of
    historical consciousness among adolescents.  Fifteen families drawn from
    three different school communities participated.  By adopting an
    intergenerational approach, the authors sought to understand how the
    defining moments of one generation-its lived history'-becomes the available
    history to the next.  In this article, the authors focus on what parents
    and children shared about one of the most formative historical events in
    parents' lives: the Vietnam War.  Drawing on notions of collective memory,
    as articulated by the French sociologist Maurice Halbwachs, the authors
    sought to understand which stories, archived in historical memory and
    available to the disciplinary community, are remembered and used by those
    beyond its borders.  In contrast, which stories are no longer widely
    shared, eclipsed by time's passage and unable to cross the bridge
    separating generation from generation? The authors conclude by discussing
    the forces that act to historicize today's youth and suggest how educators
    might marshal these forces-rather than spurning or simply ignoring them-to
    advance young people's historical understanding.",
  location     = "https://www.jstor.org/stable/30069471?sa=X&ved=2ahUKEwiOxfHPx__mAhVph-AKHfibCVcQFjAAegQICBAB"
}

@Article{imadothpa,
  author       = "Daniel~J. Magenheimer and Liz Peters and Karl Pettis and Dan Zuras",
  title        = "Integer Multiplication and Division on the {HP Precision Architecture}",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "90--99",
  keywords     = "multiplication, division, approximations",
  abstract     = "In recent years, many architectural design efforts have
    focused on maximizing performance for frequently executed, simple
    instructions.  Although these efforts have resulted in machines with better
    average price/performance ratios, certain complex instructions and, thus,
    certain classes of programs which heavily depend on these instructions may
    suffer by comparison.  Integer multiplication and division are one such set
    of complex instructions.  This paper describes how a small set of primitive
    instructions combined with careful frequency analysis and clever
    programming allows the Hewlett-Packard Precision Architecture integer
    multiplication and division implementation to provide adequate performance
    at little or no hardware cost.", 
  location     = "https://doi.org/10.1145/36206.36189"
}

@Article{aecfipooai4,
  author       = "Christos John Georgiou and Stewart~L. Palmer and P.~L. Rosenfeld",
  title        = "An Experimental Coprocessor for Implementing Persistent Objects on an {IBM} 4381",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "84--87",
  keywords     = "coprocessors, persistent objects, system architecture",
  abstract     = "In this paper we describe an experimental coprocessor for an
    IBM 4381 that is designed to facilitate the exploration of persistent objects.",
  location     = "https://doi.org/10.1145/36177.36188"
}

@TechReport{aqmafd30,
  author       = "Greg White",
  title        = "Active Queue Management Algorithms for {DOCSIS} 3.0",
  subtitle     = "A Simulation Study of CoDel, SfQ-CoDel and PIE in DOCSIS 3.0 Networks",
  institution  = "Access Network Technologies, CableLabs",
  year         = 2013,
  month        = apr,
  keywords     = "latency, buffering, buffer bloat, queue drop algorithms, pie,
    codel, sfq-codel, packet loss, tcp, performance",
  abstract     = "This paper describes the results of a simulation study of
    three active queue management algorithms applied to the upstream
    transmission buffer in a DOCSIS 3.  cable modem.  This paper is a follow-on
    to an earlier study which examined the Controlled Delay (CoDel) active
    queue management algorithm in a simulated DOCSIS 3.  cable modem.  This
    expanded study looks at CoDel in more depth, and compares it to two other
    promising active queue management algorithms, Stochastic Flow Queue - CoDel
    (SFQ- CoDel) and Proportional Integral Enhanced (PIE).  These three queue
    management algorithms are compared to existing (tail drop) buffering
    implementations that exist in current cable modems across a range of
    latency-sensitive applications.  It is demonstrated that current cable
    modem implementations result in severe degradation of user experience for
    latency-sensitive applications in situations where the user is
    simultaneously uploading a file via TCP.  The goal of the active queue
    managers in this study is to prevent the degradation of latency sensitive
    applications, while not impacting the TCP upload performance.  The
    Stochastic Flow Queue - Controlled Delay active queue manager displays
    extremely good performance in most traffic scenarios, enabling up to 2x
    reduction in latency for gaming traffic, x reduction in web page load time,
    and pristine VoIP quality, all while minimally impacting TCP upload
    performance.  The Proportional Integral Enhanced active queue manager
    similarly provided good performance, and is optimized for efficient
    implementation in existing cable modems.", 
  location     = "https://www.cablelabs.com/wp-content/uploads/2014/05/Active_Queue_Management_Algorithms_DOCSIS_3_0.pdf"
}

