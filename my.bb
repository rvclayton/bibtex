.so bibtex.header

@Article{osacm,
  author       = "Dinesh~C. Kulkarni and Arindam Banerji and David~L. Cohn",
  title        = "Operating Systems and Cost Management",
  journal      = osr,
  year         = 1994,
  volume       = 28,
  number       = 1,
  pages        = "5--10",
  month        = jan,
  keywords     = "resource management, capital costs, usage fees, cost-aware
    abstractions, cost management", 
  abstract     = "This paper introduces the emerging area of operating
    system-based cost management.  It argues that new developments are
    dramatically shortening the time constants in cost-based decisions and
    markedly increasing their complexity.  This is particularly true of mobile
    computing where usage charges will be applied to communication and to the
    rapidly developing market in for-fee services.  Consequently, system
    software must become aware of costs and must include the user in its
    optimization process.  This paper is an attempt to initiate discussion
    about operating system services that deal with monetary costs and mentions
    some basic issues involved.  The work has several speculative components;
    especially those that deal with prediction of interfaces that involve
    charges.  It looks at the evolving nature of computing costs and introduces
    the notion of a cost-aware abstraction which requires the transfer of money
    in return for some service.", 
  location     = "http://dx.doi.org/10.1145/164853.164856"
}

@Article{smbrzagc,
  author       = "Ralf L{\" a}mmel and Simon Peyton Jones",
  title        = "Scrap More Boilerplate:  Reflection, Zips and Generalised Casts",
  journal      = sigplan # " (" # pot # "Ninth ACM SIGPLAN International Conference on Functional Programming)",
  year         = 2004,
  volume       = 39,
  number       = 9,
  pages        = "244-255",
  month        = sep,
  keywords     = "generic programming, reflection, zippers, type cast, generic
    show, generic read, type reflection, generic functions",
  abstract     = "Writing boilerplate code is a royal pain.  Generic
    programming promises to alleviate this pain by allowing the programmer to
    write a generic recipe for boilerplate code, and use that recipe in many
    places.  In earlier work we introduced the Scrap your boilerplate approach
    to generic programming, which exploits Haskell's existing type-class
    mechanism to support generic transformations and queries.This paper
    completes the picture.  We add a few extra introspective or reflective
    facilities, that together support a rich variety of serialisation and
    de-serialisation.  We also show how to perform generic zips, which at first
    appear to be somewhat tricky in our framework.  Lastly, we generalise the
    ability to over-ride a generic function with a type-specific one.All of
    this can be supported in Haskell with independently-useful extensions:
    higher-rank types and type-safe cast.  The GHC implementation of Haskell
    readily derives the required type classes for user-defined data types.", 
  location     = "http://dx.doi.org/10.1145/1016848.1016883",
  location     = "http://research.microsoft.com/en-us/um/people/simonpj/papers/hmap/gmap2.ps"
}

@Article{sybwcegf,
  author       = "Ralf L{\" a}mmel and Simon Peyton Jones",
  title        = "Scrap Your Boilerplate with Class: Extensible Generic Functions",
  journal      = sigplan # " (" # pot # "Tenth ACM SIGPLAN International Conference on Functional Programming)",
  year         = 2005,
  volume       = 40,
  number       = 9,
  pages        = "204--215",
  month        = sep,
  keywords     = "generic programming, type classes, extensibility, type-case
    recursive dictionaries",
  abstract     = "The 'Scrap your boilerplate' approach to generic programming
    allows the programmer to write generic functions that can traverse
    arbitrary data structures, and yet have type-specific cases.  However, the
    original approach required all the type-specific cases to be supplied at
    once, when the recursive knot of generic function definition is tied.
    Hence, generic functions were closed.  In contrast, Haskell's type classes
    support open, or extensible, functions that can be extended with new
    type-specific cases as new data types are defined.  In this paper, we
    extend the 'Scrap your boilerplate' approach to support this open style.
    On the way, we demonstrate the desirability of abstraction over type
    classes, and the usefulness of recursive dictionaries.", 
  location     = "http://research.microsoft.com/pubs/67439/gmap3.pdf",
  location     = "http://dx.doi.org/10.1145/1090189.1086391"
}

@Article{gftmjfp,
  author       = "Ralf Hinze",
  title        = "Generics for the Masses",
  journal      = jfp,
  year         = 2006,
  volume       = 16,
  number       = "4--5",
  pages        = "451--483",
  month        = jul,
  keywords     = "generic functions, type constructors",
  abstract     = "A generic function is a function that can be instantiated on 
    many data types to obtain data type specific functionality.  Examples of
    generic functions are the functions that can be derived in Haskell, such as
    show, read, and ‘==’.  The recent years have seen a number of proposals
    that support the definition of generic functions.  Some of the proposals
    define new languages, some define extensions to existing languages.  As a
    common characteristic none of the proposals can be made to work within
    Haskell 98: they all require something extra, either a more sophisticated
    type system or an additional language construct.  The purpose of this paper
    is to show that one can, in fact, program generically within Haskell 98
    obviating to some extent the need for fancy type systems or separate tools.
    Haskell's type classes are at the heart of this approach: they ensure that
    generic functions can be defined succinctly and, in particular, that they
    can be used painlessly.  We detail three different implementations of
    generics both from a practical and from a theoretical perspective.", 
  location     = "http://www.cs.ox.ac.uk/ralf.hinze/publications/Masses.pdf"
}

@Article{ttoa1tsoae,
  author       = "L.~P. Benezet",
  title        = "The Teaching of Arithmetic {I}:  The Story of an Experiment",
  journal      = "Journal of the National Education Association",
  year         = 1935,
  volume       = 24,
  number       = 8,
  pages        = "241--244",
  month        = nov,
  keywords     = "education, pedagogy, evaluation",
  location     = "http://www.inference.phy.cam.ac.uk/sanjoy/benezet/1.html"
}


@Article{ttoa2tsoae,
  author       = "L.~P. Benezet",
  title        = "The Teaching of Arithmetic {II}:  The Story of an Experiment",
  journal      = "Journal of the National Education Association",
  year         = 1935,
  volume       = 24,
  number       = 9,
  pages        = "241--244",
  month        = dec,
  keywords     = "education, pedagogy, evaluation",
  abstract     = "This is the second installment of an article describing an
    experiment which has been carried out in Manchester, New Hampshire, since
    1929.  In the preceding section, which appeared in the November Journal,
    Mr. Benezet explained that: In some schools of Manchester, the only
    arithmetic in the first six grades was practise in estimating heights,
    areas, and the like; formal arithmetic was not introduced until the seventh
    grade.  In tests given to both the traditionally and experimentally taught
    groups, it was found that the latter had been able in one year to attain
    the level of accomplishment which the traditionally taught children had
    reached after three and one-half years of arithmetic drill.  In addition,
    because the teachers in the experimental group had had time to concentrate
    on teaching the children to read, reason, and recite, these children
    developed more interest in reading, a better vocabulary, and greater
    fluency in expression.", 
  location     = "http://www.inference.phy.cam.ac.uk/sanjoy/benezet/2.html"
}


@Article{ttoa3tsoae,
  author       = "L.~P. Benezet",
  title        = "The Teaching of Arithmetic {III}:  The Story of an Experiment",
  journal      = "Journal of the National Education Association",
  year         = 1936,
  volume       = 25,
  number       = 1,
  pages        = "7--8",
  month        = jan,
  keywords     = "education, pedagogy, evaluation",
  abstract     = "This is the third and final installment of an article by 
    Superintendent L.  P.  Benezet, in which he describes an experiment in
    arithmetic in the Manchester, New Hampshire, schools.  The first
    installments [November 1935, p. 241-4 and December 1935, p.  301-3] have
    aroused many favorable comments.  William McAndrew calls the material
    powerful good reading, a scientific article free of the common dullness of
    such. Helen Ives Schermerhorn, of New Jersey, writes that upon returning to
    teach in junior high school after many years in the adult education field,
    she was appalled at the changes which had taken place, the great number of
    new activities which had developed, each good in itself, but nevertheless
    cluttering up the time of the children.  The weakness in English seemed
    inexcusable; too little time had been given to its mastery.  I hope great
    things from the influences of Mr. Benezet's article.  A letter from C. E.
    Birch, superintendent of schools, Lawrence, Kansas, indicates that the
    Lawrence schools have been revising the arithmetic program for the past two
    years.  Mr. Birch has recommended the discussion in faculty meetings of
    the Benezet articles and their possible application in the light of the
    local situation.",
  location     = "http://www.inference.phy.cam.ac.uk/sanjoy/benezet/3.html"
}

@Article{sijrp,
  author       = "John~R. Platt",
  title        = "Strong Inference",
  journal      = "Science",
  year         = 1964,
  volume       = 146,
  number       = 3642,
  pages        = "345--353",
  month        = "16 " # oct,
  keywords     = "analytical methodology, multiple hypotheses, evaluation",
  abstract     = "Certain systematic methods of scientific thinking may
    produce much more rapid progress than others",
  location     = "http://www.jstor.org/stable/27759412"
}

@Article{irejws,
  author       = "James~W. Stamos and David~K. Gifford",
  title        = "Implementing Remote Evaluation",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 7,
  pages        = "710--722",
  month        = jul,
  keywords     = "distributed computing, linguistic support, procedure stub,
    remote evaluation, remote procedure call",
  abstract     = "Remote evaluation (REV) is a construct for building
    distributed systems that involves sending executable code from one computer
    to another computer via a communication network.  How REV can reduce
    communication and improve performance for certain classes of distributed
    applications is explained.  Implementation issues are discussed.  REV is
    incorporated into a high-level programming language by defining its syntax
    and its semantics.  The compile-time and run-time support for REV is
    discussed in both heterogeneous and homogeneous systems and compared to
    that needed by a remote procedure call implementation.  Sample performance
    measurements are included.  Experience with a prototype REV implementation
    is summarized.", 
  location     = "http://dx.doi.org/10.1109/32.56097"
}

@Article{tuoscavisedaes,
  author       = "Nancy~G. Leveson and Stephen~S. Cha and John~C. Knight and
    Timothy~J. Shimeall",
  title        = "The Use of Self Checks and Voting in Software Error Detection:  An Emperical Study",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 4,
  pages        = "432--443",
  month        = apr,
  keywords     = "acceptance tests, assertions, error detection, n-version
    programming, software fault tolerance, software reliability",
  abstract     = "The results of an empirical study of software error detection
    using self checks and N-version voting are presented.  Working
    independently, each of 24 programmers first prepared a set of self checks
    using just the requirements specification of an aerospace application, and
    then each added self checks to an existing implementation of that
    specification.  The modified programs were executed to measure the
    error-detection performance of the checks and to compare this with error
    detection using simple voting among multiple versions.  The analysis of the
    checks revealed that there are great differences in the ability of
    individual programmers to design effective checks.  It was found that some
    checks that might have been effective failed to detect an error because
    they were badly placed, and there were numerous instances of checks
    signaling nonexistent errors.  In general, specification-based checks alone
    were not as effective as specification-based checks combined with
    code-based checks.  Self checks made it possible to identify faults that
    had not been detected previously by voting 28 versions of the program over
    a million randomly generated inputs.  This appeared to result from the fact
    that the self checks could examine the internal state of the executing
    program, whereas voting examines only final results of computations.  If
    internal states had to be identical in N-version voting systems, then there
    would be no reason to write multiple versions.", 
  location     = "http://dx.doi.org/10.1109/32.54295"
}

@Article{vsaidas,
  author       = "Wojciech Mazurczyk",
  title        = "{VoIP} Steganography and Its Detection---{A} Survey",
  journal      = surveys,
  year         = 2013,
  volume       = 46,
  number       = 2,
  pages        = "20:1--20:21",
  month        = nov,
  keywords     = "information hiding, steganography, voip, ip telephony",
  abstract     = "Steganography is an ancient art that encompasses various
    techniques of information hiding, the aim of which is to embed secret
    information into a carrier message.  Steganographic methods are usually
    aimed at hiding the very existence of the communication.  Due to the rise
    in popularity of IP telephony, together with the large volume of data and
    variety of protocols involved, it is currently attracting the attention of
    the research community as a perfect carrier for steganographic purposes.
    This article is a first survey of the existing Voice over IP (VoIP)
    steganography methods and their countermeasures.", 
  location     = "http://dx.doi.org/10.1145/2543581.2543587"
}

@Article{rmibc,
  author       = "Norman Ramsey",
  title        = "Relocating Machine Instructions by Currying",
  journal      = sigplan # " (" # pot # "ACM SIGPLAN Conference on Programming Language Design and Implementation)",
  year         = 1996,
  volume       = 31,
  number       = 5,
  pages        = "226--236",
  month        = may,
  keywords     = "instruction encodings, relocation, linking, lifting, lambda
    encodings", 
  abstract     = "Relocation adjusts machine instructions to account for 
    changes in the locations of the instructions themselves or of external
    symbols to which they refer.  Standard linkers implement a finite set of
    relocation transformations, suitable for a single architecture.  These
    transformations are enumerated, named, and engraved in a machine-dependent
    object-file format, and linkers must recognize them by name.  These names
    and their associated transformations are an unnecessary source of
    machine-dependence.The New Jersey Machine-Code Toolkit is an application
    generator.  It helps programmers create applications that manipulate
    machine code, including linkers.  Guided by a short instruction-set
    specification, the toolkit generates the bit-manipulating code.
    Instructions are described by constructors, which denote functions mapping
    lists of operands to instructions' binary representations.  Any operand can
    be designated as relocatable, meaning that the operand's value need not be
    known at the time the instruction is encoded.  For instructions with
    relocatable operands, the toolkit computes relocating transformations.
    Tool writers can use the toolkit to create machine-independent software
    that relocates machine instructions.  mld, a retargetable linker built with
    the toolkit, needs only 20 lines of C code for relocation, and that code is
    machine-independent.The toolkit discovers relocating transformations by
    currying encoding functions.  An attempt to encode an instruction with a
    relocatable operand results in the creation of a closure.  The closure can
    be applied when the values of the relocatable operands become known.
    Currying provides a general, machine-independent method of
    relocation.Currying rewrites a &lambda;-term into two nested
    &lambda;-terms.  The standard implementation has the first &lambda;
    allocate a closure and store therein its operands and a pointer to the
    second &lambda;.  Using this strategy in the toolkit means that, when it
    builds an application, the toolkit generates code for many different inner
    &lambda;-terms---one for each instruction that uses a relocatable address.
    Hoisting some of the computation out of the second &lambda; into the first
    makes many of the second &lambda;s identical---a handful are enough for a
    whole instruction set.  This optimization reduces the size of
    machine-dependent assembly and linking code by 15--20% for the MIPS, SPARC,
    and PowerPC, and by about 30% for the Pentium.  It also makes the second &
    lambda;s equivalent to relocating transformations named in standard
    object-file formats.", 
  location     = "http://dx.doi.org/10.1145/249069.231429"
}

@Article{tcias,
  author       = "Yih-Farn Chen and Michael~Y. Nishimoto and C.~V. Ramamoorthy",
  title        = "The {C} Information Abstraction System",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 3,
  pages        = "325--334",
  month        = mar,
  keywords     = "entity-relation model, hierarchy, hypertext, modularization,
    multiple views, program database, software maintenance, software metrics,
    software restructuring, software reliability",
  abstract     = "A system for analyzing program structures is described.  The
    system extracts relational information from C programs according to a
    conceptual model and stores the information in a database.  It is shown how
    several interesting software tasks can be performed by using the relational
    views.  These tasks include generation of graphical views, subsystem
    extraction, program layering, dead code elimination and binding analysis.",
  location     = "http://dx.doi.org/10.1109/32.48940"
}

@TechReport{afsmotmaiidsa,
  author       = "Stuart~E. Dreyfus and Hubert~L. Dreyfus",
  title        = "{A} Five-Stage Model of the Mental Activities Involved in Directed Skill Acquisition",
  institution  = "Operations Research Center, " # ucal,
  year         = 1980,
  number       = "ORC 80-2",
  address      = bca,
  month        = feb,
  keywords     = "novice, competence, proficiency, expertise, mastery",
  abstract     = "In acquiring a skill by means of instruction and experience,
    the student normally passes through five developmental stages which we
    designate novice, competence, proficiency, expertise and mastery.  We
    argue, based on analysis of careful descriptions of skill acquisition, that
    as the student becomes skilled, he depends less on abstract principles and
    more on concrete experience.  We systematize and illustrate the progressive
    changes in a performer's ways of seeing his task environment.  We conclude
    that any skill-training procedure must be based on some model of skill
    acquisition, so that it can address, at each stage of training,the
    appropriate issues involved in facilitating advancement.", 
  location     = "http://www.dtic.mil/get-tr-doc/pdf?AD=ADA084551"
}

@Book{taospk,
  author       = "Philip Kitcher",
  title        = "The Advancement of Science",
  publisher    = oup,
  year         = 1993,
  address      = nyny,
  keywords     = "philosophy of science, rationality, scientific progress,
    cognitive labor, darwin",
  location     = "Q 175.K533"
}

@Book{tcmfj,
  author       = "Frans Johansson",
  title        = "The Click Moment",
  publisher    = "Portfolio/Penguin",
  year         = 2012,
  address      = nyny,
  keywords     = "marketing, creativity, success, strategy serendipity",
  location     = "HF 5386.J59"
}

