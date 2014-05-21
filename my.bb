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

@Article{sfprbf,
  author       = "Robert Bruce Findler and Matthew Flatt",
  title        = "Slideshow: Functional Presentations",
  journal      = jfp,
  year         = 2006,
  volume       = 16,
  number       = "4--5",
  pages        = "583--619",
  month        = jul,
  keywords     = "presentation software, graphical programming",
  abstract     = "Among systems for creating slide presentations, the dominant
    ones offer essentially no abstraction capability.  Slideshow represents our
    effort over the last several years to build an abstraction-friendly slide
    system with PLT Scheme.  We show how functional programming is well suited
    to the task of slide creation, we report on the programming contructs that
    we have developed for slides, and we describe our solutions to practical
    problems in rendering slides.  We also describe experimental extensions to
    DrScheme that support a mixture of programmatic and WYSIWYG slide
    creation.", 
  location     = "http://dx.doi.org/10.1017/S0956796806006010", 
  location     = "http://www.cs.utah.edu/plt/publications/jfp05-ff.pdf"
}

@Article{ocfmi,
  author       = "Daniel Hoffman",
  title        = "On Criteria for Module Interfaces",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 5,
  pages        = "537--542",
  month        = may,
  keywords     = "module interface, design, parnas decompsition, software
    design, software quality", 
  abstract     = "While the benefits of modular software development are widely
    acknowledged, there is little agreement as to what constitutes a good
    module interface.  Computational complexity techniques allow evaluation of
    algorithm time and space costs but offer no guidance in the design of the
    interface to an implementation.  Yet, interface design decisions often have
    a critical effect on the development and maintenance costs of large
    software systems.  Criteria that have led to simple, elegant interfaces are
    presented in detail.  These criteria have been developed and refined
    through repeated practical application.  The use of the criteria is
    illustrated with concrete examples.", 
  location     = "http://dx.doi.org/10.1109/32.52776"
}

@Article{cbfc,
  author       = "Dimoulas, Christos and Findler, Robert Bruce and Flanagan, Cormac and Felleisen, Matthias",
  title        = "Correct Blame for Contracts",
  journal      = sigplan # " (" # pot # "38th Annual " # popl # ")", 
  year         = 2011,
  volume       = 46,
  number       = 1,
  pages        = "215--226",
  month        = jan,
  keywords     = "high-order programming, behavioral contracts, blame
    assignment",
  abstract     = "Behavioral software contracts supplement interface
    information with logical assertions.  A rigorous enforcement of contracts
    provides useful feedback to developers if it signals contract violations as
    soon as they occur and if it assigns blame to violators with
    precise explanations.  Correct blame assignment gets programmers started
    with the debugging process and can significantly decrease the time needed
    to discover and fix bugs.  Sadly the literature on contracts lacks a
    framework for making statements about the correctness of blame assignment
    and for validating such statements.  This paper fills the gap and uses the
    framework to demonstrate how one of the proposed semantics for higher-order
    contracts satisfies this criteria and another semantics occasionally
    assigns blame to the wrong module.  Concretely, the paper applies the
    framework to the lax enforcement of dependent higher-order contracts and
    the picky one.  A higher-order dependent contract specifies constraints for
    the domain and range of higher-order functions and also relates arguments
    and results in auxiliary assertions.  The picky semantics ensures that the
    use of arguments in the auxiliary assertion satisfies the domain contracts
    and the lax one does not.  While the picky semantics discovers more
    contract violations than the lax one, it occasionally blames the wrong
    module.  Hence the paper also introduces a third semantics, dubbed indy,
    which fixes the problems of the picky semantics without giving up its
    advantages.", 
  location     = "http://dx.doi.org/10.1145/1926385.1926410", 
  location     = "http://www.ccs.neu.edu/racket/pubs/popl11-dfff.pdf"
}

@Article{afftadodsd,
  author       = "Chen Ding and Prabhaker Mateti",
  title        = "{A} Framework for the Automated Drawing of Data Structure Diagrams",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 5,
  pages        = "543--557",
  month        = may,
  keywords     = "aesthetics, data structure diagrams, documentation systems,
    line drawings, visual debugging",
  abstract     = "Data structure diagrams are two-dimensional figures made up
    of lines that aim to pictorially indicate the interrelationships of the
    elements of a data structure.  The various rules and factors of aesthetics
    that go into the way data structure diagrams are drawn are collected
    together.  The various subjective factors are formulated into computable
    objectives and numeric parameters.  These are distilled from a large number
    of data structure drawings found in various textbooks.  The rules used have
    not reached a level of acceptance comparable to that of the relevant rules
    in engineering graphics.  The internal architecture of a (sub)system that
    helps draw data structure diagrams is outlined.", 
  location     = "http://dx.doi.org/10.1109/32.52777"
}

@Article{atpltsitbcs,
  author       = "Soklei Leong and Stephen Jodis and Kevin Sullivan and Oliver
    Jiang and P.~A.~D. {de Maine}",
  title        = "{A} Transportable Programming Language ({TPL}) System---{II}:  The Bifunctional Compiler System",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 6,
  pages        = "639--646",
  month        = jun,
  seealso      = "For pt. I see P.A.D. de Maine, S. Leong, and C.G. Dairs, Int. J. Comput. Inform. Sci., vol. 14, p. 161--82, 1985.",
  keywords     = "compiler compilers, conversion rule description languages,
    program transportation, software conversion, software portability",
  abstract     = "The transportable programming language (TPL) method is a 
    high-level-language approach that uses a bifunctional compiler to
    efficiently convert code among various dialects of a particular high-level
    language (HLL) via the hypothetical parent of the high-level language
    (HPHLL).  The TPL compiler system that has been implemented has three
    parts: a rule modifier, a table generator, and a TPL compiler.  A
    metalanguage, called the conversion rule description language (CRDL), is
    used to describe the conversion of a dialect to HPHLL and of the HPHLL to
    another dialect.  The table generator translates those descriptions to
    tabular forms that drive the bifunctional compiler.  The TPL compiler can
    then be used to translate programs coded in a local dialect into HPHLL and
    vice versa.  The rule modifier alters the descriptions of a default-a
    synthetic `most common'-dialect.  It greatly simplifies the task of writing
    the conversion descriptions for a new environment or dialect.  The TPL
    method is now being extended so that it can be used to retarget a dialect
    of any HLL to a standard environment such as Ada.  Details of the TPL
    compiler system are given", 
  location     = "http://dx.doi.org/10.1109/32.55092"
}

@Article{tdokatvplfcotx3,
  author       = "Matthew~B. MacLaurin",
  title        = "The Design of {Kodu}:  {A} Tiny Visual Programming Language for Children on the {Xbox} 360",
  journal      = sigplan # " (" # pot # "38th Annual " # popl # ")", 
  year         = 2011,
  volume       = 46,
  number       = 1,
  pages        = "241--246",
  month        = jan,
  keywords     = "games, game programming, 3d user interface, end-user
    authoring, K12 programming, programming early education, kodu, boku",
  abstract     = "Kodu is a relatively new programming language designed
    specifically for young children to learn through independent exploration.
    Kodu seeks to lower the barrier to entry for new programmers by presenting
    a radically simplified programming model which nevertheless has significant
    expressive power.  Kodu is integrated in a real-time 3D gaming environment
    and is designed to compete with modern console games in terms of intuitive
    user interface and graphical production values.  In this paper we will
    review key tradeoffs made in the design of the programming language and
    illustrate how it is one of very few languages designed using user
    interface design principles and methodologies, to the extent that the blend
    of subjective and objective factors considered in the language design have
    succeeded in presenting a model of programming which is uniquely
    approachable and creatively empowering for non-technical users.", 
  location     = "http://dx.doi.org/10.1145/1925844.1926413"
}

@Article{tdaioaa1cc,
  author       = "Gerald~W. Neufeld and Yueli Yang",
  title        = "The Design and Implementation of an {ASN}.1-{C} Compiler",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 10,
  pages        = "1209--1220",
  month        = oct,
  keywords     = "abstract syntax, compilers, computer communication, external
    data representation, languages, open system interconnection, transfer
    syntax", 
  abstract     = "Abstract syntax notation one (ASN.1) has been widely used in 
    international standard specification: its transfer-syntax, the basic
    encoding rules (BER), is used as the external data representation.  A BER
    implementation called the ED library is presented.  The ED library includes
    a number of encoding and decoding routines that may be used as primitive
    functions to compose encoders and decoders for arbitrarily complicated
    ASN.1 data types.  Based on the ED library an ASN.1-C compiler, called
    CASN1, is designed and implemented to free the protocol implementers from
    the arduous work of translating protocol-defined data-types and
    constructing their encoders and decoders.  Given an ASN.1 protocol
    specification, CASN1 automatically translates the input ASN.1 modules into
    C and generates the BER encoders and decoders for the protocol defined
    data-types.  The CASN1 design principles, user interface, and some example
    applications are discussed.  The performance of the ED library and
    generated CASN1 code is also measured and discussed.", 
  location     = "http://dx.doi.org/10.1109/32.60300"
}

@Article{mvsos,
  author       = "Allan Heydon and Mark~W. Maimone and J.~D. Tygar and
    Jeannette~M. Wing and Amy Moormann Zaremski",
  title        = "Mir{\' o}: Visual Specification of Security",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 10,
  pages        = "1185--11987",
  month        = oct,
  keywords     = "formal specifications, higraph, security, specification
    tools, visual language",
  abstract     = "Miro is a set of languages and tools that support the visual
    specification of file system security.  Two visual languages are presented:
    the instance language, which allows specification of file system access,
    and the constraint language, which allows specification of security
    policies.  Miro visual languages and tools are used to specify security
    configurations.  A visual language is one whose entities are graphical,
    such as boxes and arrows, specifying means stating independently of any
    implementation the desired properties of a system.  Security means file
    system protection: ensuring that files are protected from unauthorized
    access and granting privileges to some users, but not others.  Tools
    implemented and examples of how these languages can be applied to real
    security specification problems are described.", 
  location     = "http://dx.doi.org/10.1109/32.60298"
}

@Article{mafcpeveafhol,
  author       = "Simon Marlow and Simon {Peyton Jones}",
  title        = "Making A Fast Curry: Push/Enter vs. Eval/Apply for Higher-order Languages",
  journal      = jfp,
  year         = 2006,
  volume       = 16,
  number       = "4--5",
  pages        = "415--449",
  month        = jul,
  keywords     = "currying, functional programming, intermediate
    representation, optimizations, performance",
  abstract     = "Higher-order languages that encourage currying are typically
    implemented using one of two basic evaluation models: push/enter or
    eval/apply.  Implementors use their intuition and qualitative judgements to
    choose one model or the other.  Our goal in this paper is to provide, for
    the first time, a more substantial basis for this choice, based on our
    qualitative and quantitative experience of implementing both models in a
    state-of-the-art compiler for Haskell.  Our conclusion is simple, and
    contradicts our initial intuition: compiled implementations should use
    eval/apply.", 
  location     = "http://research.microsoft.com/apps/pubs/default.aspx?id=67488",
  location     = "http://dx.doi.org/10.1017/S0956796806005995"
}

@article{rcitpoosc,
  author       = "Bruggeman, Carl and Waddell, Oscar and Dybvig, R.~Kent",
  title        = "Representing control in the presence of one-shot continuations",
  journal      = sigplan # " (" # pot # "ACM SIGPLAN Conference on Programming Language Design and Implementation, PLDI '96)",
  year         = 1996,
  volume       = 31,
  number       = 5,
  pages        = "99--107",
  month        = may,
  keywords     = "scheme, continuations, run-time representations,
    compilation",
  abstract     = "Traditional first-class continuation mechanisms allow a 
    captured continuation to be invoked multiple times.  Many continuations,
    however, are invoked only once.  This paper introduces one-shot
    continuations, shows how they interact with traditional multi-shot
    continuations, and describes a stack-based implementation of control that
    handles both one-shot and multi-shot continuations.  The implementation
    eliminates the copying overhead for one-shot continuations that is inherent
    in multi-shot continuations.", 
  location     = "http://dx.doi.org/10.1145/231379.231395"
}

@Article{aofianvse,
  author       = "Brilliant, Susan~S. and Knight, John~C. and Leveson, Nancy~G.",
  title        = "Analysis of Faults in an {\it N}-Version Software Experiment",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 2,
  pages        = "238--247",
  month        = feb,
  keywords     = "design, diversity, fault-tolerant software, multiversion
    programming, n-version programming, software reliability",
  abstract     = "The authors have conducted a large-scale experiment in 
    N-version programming.  A total of 27 versions of a program were prepared
    independently from the same specification at two universities.  The results
    of executing the versions revealed that the versions were individually
    extremely reliable but that the number of input cases in which more than
    one failed was substantially more than would be expected if they were
    statistically independent.  After the versions had been executed, the
    failures of each version were examined and the associated faults located.
    It appears that minor differences in the software development environment
    would not have a major impact in reducing the incidence of faults that
    cause correlated failures.", 
  location     = "http://dx.doi.org/10.1109/32.44387"
}

@Article{ealimp,
  author       = "Adl-Tabatabai, Ali-Reza and Langdale, Geoff and Lucco, Steven
  and Wahbe, Robert",
  title        = "Efficient and Language-Independent Mobile Programs",
  journal      = sigplan # " (" # pot # "ACM SIGPLAN Conference on Programming Language Design and Implementation, PLDI '96)",
  year         = 1996,
  volume       = 31,
  number       = 5,
  pages        = "127-136",
  month        = may,
  keywords     = "intermediate representations, code translation, software
    reliability, mobile software",
  abstract     = "This paper evaluates the design and implementation of 
    Omniware: a safe, efficient, and language-independent system for executing
    mobile program modules.  Previous approaches to implementing mobile code
    rely on either language semantics or abstract machine interpretation to
    enforce safety.  In the former case, the mobile code system sacrifices
    universality to gain safety by dictating a particular source language or
    type system.  In the latter case, the mobile code system sacrifices
    performance to gain safety through abstract machine interpretation.
    Omniware uses software fault isolation, a technology developed to provide
    safe extension code for databases and operating systems, to achieve a
    unique combination of language-independence and excellent performance.
    Software fault isolation uses only the semantics of the underlying
    processor to determine whether a mobile code module can corrupt its
    execution environment.  This separation of programming language
    implementation from program module safety enables our mobile code system to
    use a radically simplified virtual machine as its basis for portability.
    We measured the performance of Omniware using a suite of four SPEC92
    programs on the Pentium, PowerPC, Mips, and Sparc processor architectures.
    Including the overhead for enforcing safety on all four processors, OmniVM
    executed the benchmark programs within 21% as fast as the optimized, unsafe
    code produced by the vendor-supplied compiler.",
  location     = "http://dx.doi.org/10.1145/231379.231402"
}

@Article{vgspoatp,
  author       = "Laura~K. Dillon",
  title        = "Verifying General Safety Properties of {A}da Tasking Programs",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 1,
  pages        = "51--63",
  month        = jan,
  keywords     = "ada tasking, axiomatic specification, isolation approach,
    mechanical verification systems, program verification, safety properties,
    symbolic execution, verification conditions",
  abstract     = "The isolation approach to symbolic execution of Ada tasking
    programs provides a basis for automating partial correctness proofs.  The
    strength of this approach lies in its isolation nature; tasks are
    symbolically executed and verified independently, and then checked for
    cooperation where interference can occur.  This keeps the verification task
    computationally feasible and enhances its compositionality.  Safety,
    however, is a more appropriate notion of correctness for concurrent
    programs than partial correctness.  The author shows how the isolation
    approach to symbolic execution of Ada tasking program supports the
    verification of general safety properties.  Specific safety properties that
    are considered include mutual exclusion, freedom from deadlock, and absence
    of communication failure.  The techniques are illustrated using a solution
    to the readers and writers problem.", 
  location     = "http://dx.doi.org/10.1109/32.44363"
}

@Article{rcbpe,
  author       = "Michael Sperber and Peter Thiemann",
  title        = "Realistic Compilation By Partial Evaluation",
  journal      = sigplan # " (" # pot # "ACM SIGPLAN Conference on Programming Language Design and Implementation, PLDI '96)",
  year         = 1996,
  volume       = 31,
  number       = 5,
  pages        = "206--214",
  month        = may,
  keywords     = "semantics-directed compiler generation, partial evaluation,
  compilation of higher-order functional languages",
  abstract     = "Two key steps in the compilation of strict functional
    languages are the conversion of higher-order functions to data structures
    (closures) and the transformation to tail-recursive style.  We show how to
    perform both steps at once by applying first-order offline partial
    evaluation to a suitable interpreter.  The resulting code is easy to
    transliterate to low-level C or native code.  We have implemented the
    compilation to C; it yields a performance comparable to that of other
    modern Scheme-to-C compilers.  In addition, we have integrated various
    optimizations such as constant propagation, higher-order removal, and arity
    raising simply by modifying the underlying interpreter.  Purely first-order
    methods suffice to achieve the transformations.  Our approach is an
    instance of semantics-directed compiler generation.", 
  location     = "http://dx.doi.org/10.1145/231379.231419"
}

@Article{pntftsaaosc,
  author       = "Willson, Reg~G. and Krogh, Bruce~H.",
  title        = "Petri Net Tools for the Specification and Analysis of Discrete Controllers",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 1,
  pages        = "39--50",
  month        = jan,
  keywords     = "control, analysis, discrete state systems, modeling, petri
    nets, specifications, model checking, system design",
  abstract     = "An approach is presented for the specification, modeling, and
    analysis of discrete-state systems and controllers.  The approach features
    a rule-based state-variable-specification formalism that is translated into
    Petri net models composed of interconnected statemachines.  The concept of
    reduced reachability graphs is introduced as a means of reducing the
    computational effort required to isolate and analyze subcomponent behavior
    within the system.  The target application is discrete manufacturing
    systems where the costs involved in writing, debugging, and maintaining of
    code for online process control can be significantly reduced through the
    use of automated modeling and analysis techniques.  The approach is
    illustrated by an example of a simple discrete-state system.", 
  location     = "http://dx.doi.org/10.1109/32.44362"
}

@Article{fsadtt,
  author       = "Garrard, Christopher Paul and Coleman, Derek and Gallimore, Robin~M.",
  title        = "Formal Specification and Design Time Testing",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 1,
  pages        = "1--12",
  month        = jan,
  keywords     = "abstract data type, design validation, dynamic testing,
    formal specification, obj",
  abstract     = "It is shown how design time testing can be used in
    conjunction with formal specification.  Emphasis is placed on the benefits
    of using an executable specification language OBJ, of having a design
    controlled by requirements specification, and of adherence to the
    regularity and uniformity hypotheses in dynamic validation.  It is shown
    that such an approach offers positive benefits by providing early design
    validation and a controlled, disciplined design process.", 
  location     = "http://dx.doi.org/10.1109/32.44359"
}

@Article{casclfasag,
  author       = "Olender, Kurt~M. and Osterweil, Leon~J.",
  title        = "Cecil:  {A} Sequencing Constraint Language for Automatic Static Analysis Generation",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 3,
  pages        = "268--280",
  month        = mar,
  keywords     = "dataflow analysis, finite state machines, sequencing,
    specification, static analysis",
  abstract     = "A flexible and general mechanism for specifying problems
    relating to the sequencing of events and mechanically translating them into
    dataflow analysis algorithms capable of solving those problems is
    presented.  Dataflow analysis has been used for quite some time in compiler
    code optimization.  Most static analyzers have been custom-built to search
    for fixed and often quite limited classes of dataflow conditions.  It is
    shown that the range of sequences for which it is interesting and
    worthwhile to search in actually quite broad and diverse.  A formalism for
    specifying this diversity of conditions is created.  It is shown that these
    conditions can be modeled essentially as dataflow analysis problems for
    which effective solutions are known.  It is also shown how these solutions
    can be exploited to serve as the basis for mechanical creation of analyzers
    for these conditions.", 
  location     = "http://dx.doi.org/10.1109/32.48935"
}

@Article{fedc,
  author       = "Auslander, Joel and Philipose, Matthai and Chambers, Craig
    and Eggers, Susan~J. and Bershad, Brian~N.",
  title        = "Fast, Effective Dynamic Compilation",
  journal      = sigplan # " (" # pot # "ACM SIGPLAN Conference on Programming Language Design and Implementation, PLDI '96)",
  year         = 1996,
  volume       = 31,
  number       = 5,
  pages        = "149--159",
  month        = may,
  keywords     = "dynamic compilation, run-time optimization, program
    annotations, static compilation",
  abstract     = "Dynamic compilation enables optimization based on the values
    of invariant data computed at run-time.  Using the values of these run-time
    constants, a dynamic compiler can eliminate their memory loads, perform
    constant propagation and folding, remove branches they determine, and fully
    unroll loops they bound.  However, the performance benefits of the more
    efficient, dynamically-compiled code are offset by the run-time cost of the
    dynamic compile.  Our approach to dynamic compilation strives for both fast
    dynamic compilation and high-quality dynamically-compiled code: the
    programmer annotates regions of the programs that should be compiled
    dynamically; a static, optimizing compiler automatically produces
    pre-optimized machine-code templates, using a pair of dataflow analyses
    that identify which variables will be constant at run-time; and a simple,
    dynamic compiler copies the templates, patching in the computed values of
    the run-time constants, to produce optimized, executable code.  Our work
    targets general- purpose, imperative programming languages, initially C.
    Initial experiments applying dynamic compilation to C programs have
    produced speedups ranging from 1.2 to 1.8.", 
  location     = "http://www.cs.washington.edu/research/dyncomp/Papers/pldi96.pdf",
  location     = "http://dx.doi.org/10.1145/231379.231409"
}

@Article{rrmisuamitbtollic,
  author       = "Norman Ramsey and Jo{\~ a}o Dias",
  title        = "Resourceable, Retargetable, Modular Instruction Selection Using a Machine-Independent, Type-Based Tiling of Low-Level Intermediate Code",
  journal      = sigplan # " (" # pot # "38th Annual " # popl # ")", 
  year         = 2011,
  volume       = 46,
  number       = 1,
  pages        = "575--586",
  month        = jan,
  keywords     = "code generation, retargetable compilers, intermediate
    representation, c--, instruction selection, rtl",
  abstract     = "We present a novel variation on the standard technique of 
    selecting instructions by tiling an intermediate-code tree.  Typical
    compilers use a different set of tiles for every target machine.  By
    analyzing a formal model of machine-level computation, we have developed a
    single set of tiles that is machine-independent while retaining the
    expressive power of machine code.  Using this tileset, we reduce the number
    of tilers required from one per machine to one per architectural family
    (e.g., register architecture or stack architecture).  Because the tiler is
    the part of the instruction selector that is most difficult to reason
    about, our technique makes it possible to retarget an instruction selector
    with significantly less effort than standard techniques.  Retargeting
    effort is further reduced by applying an earlier result which generates the
    machine-dependent implementation of our tileset automatically from a
    declarative description of instructions' semantics.  Our design has the
    additional benefit of enabling modular reasoning about three aspects of
    code generation that are not typically separated: the semantics of the
    compiler's intermediate representation, the semantics of the target
    instruction set, and the techniques needed to generate good target code.",
  location     = "http://www.cs.tufts.edu/~nr/pubs/tiler-abstract.html",
  location     = "http://dx.doi.org/10.1145/1926385.1926451"
}

@Article{fpiteaeotsp,
  author       = "Graham~C. Low and D.~Ross Jeffery",
  title        = "Function Points in the Estimation and Evaluation of the Software Process",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 1,
  pages        = "64--71",
  month        = jan,
  keywords     = "estimation, function points, lines of code, qualitative
    measurement, software management, software size",
  abstract     = "The authors report the results of an empirical research
    project on the consistency and limitations of the number of function points
    as an a priori measure of system size rather than the traditional
    lines-of-code measure.  They conclude that function points are a more
    consistent a priori measure of system size.  The results also indicate that
    the function-point estimate of size is lower for analysts experienced both
    in software development and in function-point estimation.", 
  location     = "http://dx.doi.org/10.1109/32.44364"
}

@Article{caape,
  author       = "William~E. Howden",
  title        = "Comments Analysis and Programming Errors",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 1,
  pages        = "72--81",
  month        = jan,
  keywords     = "associations, comments, errors, false assumptions, faults,
    flavors, validation, assertions",
  abstract     = "Software validation is treated as the problem of detecting
    errors that programmers make during the software development process.  This
    includes fault detection, in which the focus is on techniques for detecting
    the occurrence of local errors that result in well-defined classes of
    program statement faults.  It also includes detecting other kinds of
    errors, such as decomposition errors.  The main focus of the work is on a
    decomposition-error analysis technique called comments analysis.  In this
    technique, errors are detected by analyzing special classes of program
    comments.  Comments analysis has been applied to a variety of systems,
    including a data-processing program and an avionics real-time program.  The
    use of comments analysis for sequential and concurrent systems is
    discussed, and the basic features of comments analysis tools are
    summarized.  The relationship of comments analysis to other techniques,
    such as event sequence analysis, is discussed, and the differences between
    it and earlier work are explained.", 
  location     = "http://dx.doi.org/10.1109/32.44365"
}

@Article{varevfdcgs,
  author       = "Dawson~R. Engler",
  title        = "{\sc VCODE}:  {A} Retargetable, Extensible, Very Fast Dynamic Code Generation System",
  journal      = sigplan # " (" # pot # "ACM SIGPLAN Conference on Programming Language Design and Implementation, PLDI '96)",
  year         = 1996,
  volume       = 31,
  number       = 5,
  pages        = "160--170",
  month        = may,
  keywords     = "dynamic code generation, run-time code generation",
  abstract     = "We present vcode, a portable, extensible, very fast dynamic
    code generation system.  An important feature of vcode is that it generates
    machine code ``in-place'' without the use of intermediate data structures.
    Eliminating the need to construct and consume an intermediate
    representation at runtime makes vcode both efficient and extensible.  vcode
    dynamically generates code at an approximate cost of six to ten
    instructions per generated instruction, making it over an order of
    magnitude faster than the most efficient general-purpose code generation
    system in the literature.  Dynamic code generation is relatively well known
    within the compiler community.  However, due in large part to the lack of a
    publicly available dynamic code generation system, it has remained a
    curiosity rather than a widely used technique.  A practical contribution of
    this work is the free, unrestricted distribution of the vcode system, which
    currently runs on the MIPS, SPARC, and Alpha architectures.", 
  location     = "http://www.stanford.edu/~engler/vcode-pldi.ps"
}

@Article{cadmaisdtfop,
  author       = "Surya~B. Yadav",
  title        = "Control and Definition Modularization:  An Improved Software Design Technique for Organizing Programs",
  journal      = tse,
  year         = 1990,
  volume       = 16,
  number       = 1,
  pages        = "92--99",
  month        = jan,
  keywords     = "control and definition modules, program layout, software
    design techniques, software maintenance, software design",
  abstract     = "The author proposes a technique called control and definition
    modularization (CDM), which derives a systematic program layout from a
    given structure chart using the concepts of `control' and `definition'
    modules.  A control module includes processes for handling a conceptual
    data object not directly implementable.  A definition module defines
    operations associated with a concrete data object implementable using a
    primitive or derived data type of a programming language.  Grouping the
    operations available for each concrete data object, and keeping them
    separated from execution flow, improves programs maintainability.  This
    technique extends the structured design methodology and provides designers
    with a systematic way of deriving informational strength modules as well as
    a structured physical layout from the structure chart.  A program based on
    the CDM technique is easier to understand and maintain.  This research
    makes a significant contribution toward bridging the gap between structured
    design and object-oriented concepts", 
  location     = "http://dx.doi.org/10.1109/32.44367"
}

@Article{ppaugplpsacs,
  author       = "Dawson, Steven and Ramakrishnan, C.~R. and Warren, David~S.",
  title        = "Practical Program Analysis Using General Purpose Logic Programming Systems --- {A} Case Study",
  journal      = sigplan # " (" # pot # "ACM SIGPLAN Conference on Programming Language Design and Implementation, PLDI '96)",
  year         = 1996,
  volume       = 31,
  number       = 5,
  pages        = "117--126",
  month        = may,
  keywords     = "program analysis, constraint-based programming, logic
    programming, execution efficiency, finite-domain analysis, tabled
    evaluation",
  abstract     = "Many analysis problems can be cast in the form of evaluating
    minimal models of a logic program.  Although such formulations are
    appealing due to their simplicity and declarativeness, they have not been
    widely used in practice because, either existing logic programming systems
    do not guarantee completeness, or those that do have been viewed as too
    inefficient for integration into a compiler.  The objective of this paper
    is to re-examine this issue in the context of recent advances in
    implementation technologies of logic programming systems.We find that such
    declarative formulations can indeed be used in practical systems, when
    combined with the appropriate tool for evaluation.  We use existing
    formulations of analysis problems --- groundness analysis of logic
    programs, and strictness analysis of functional programs --- in this case
    study, and the XSB system, a table-based logic programming system, as the
    evaluation tool of choice.  We give experimental evidence that the
    resultant groundness and strictness analysis systems are practical in terms
    of both time and space.  In terms of implementation effort, the analyzers
    took less than 2 man-weeks (in total), to develop, optimize and evaluate.
    The analyzer itself consists of about 100 lines of tabled Prolog code and
    the entire system, including the components to read and preprocess input
    programs and to collect the analysis results, consists of about 500 lines
    of code.", 
  location     = "http://dx.doi.org/10.1145/231379.231399"
}

@Article{sofpabpfoa,
  author       = "Shu, N.~C. and Lum, V.~Y. and Tung, F.~C. and Chang, C.~L.",
  title        = "Specification of Forms Processing and Business Procedures for Office Automation",
  journal      = tse,
  year         = 1982,
  volume       = 8,
  number       = 5,
  pages        = "499-512",
  month        = sep,
  keywords     = "application development, application specification, data
    processing for non-DP professionals, form data model, form processing,
    office automation, office information systems, office/business procedure
    automation, programming by forms",
  abstract     = "Business activities, in general, involve data processing
    (such as queries, extraction, manipulation, and restructuring of data,
    etc.) as well as conventional office work centered around preparation,
    distribution, and filing and retrieval of documents.  Convinced that most
    of these activities can be expressed in terms of forms, we present in this
    paper a formal means for specification of forms processing.  The underlying
    concept is that business functions can be decomposed into meaningfully
    connected form processes where each process either produces or modifies a
    form.  Powerful constructs are provided so that most of the common data
    processing activities can be expressed in a very high level, concise, and
    yet compilable manner.",
  location     = "http://dx.doi.org/10.1109/TSE.1982.235738"
}

@Article{hsstfip,
  author       = "Hennessy, John and Jouppi, Norman and Baskett, Forest and
    Gross, Thomas and Gill, John",
  title        = "Hardware/Software Tradeoffs for Increased Performance",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "2--11",
  month        = mar,
  keywords     = "virtual addressing, caching, operating system, system
    performance, hardware-software trade-offs, memory management, IPC, system
    design, mips, chord, mach",
  abstract     = "Most new computer architectures are concerned with maximizing
    performance by providing suitable instruction sets for compiled code and
    providing support for systems functions.  We argue that the most effective
    design methodology must make simultaneous tradeoffs across all three areas:
    hardware, software support, and systems support.  Recent trends lean
    towards extensive hardware support for both the compiler and operating
    systems software.  However, consideration of all possible design tradeoffs
    may often lead to less hardware support.  Several examples of this approach
    are presented, including: omission of condition codes, word-addressed
    machines, and imposing pipeline interlocks in software.  The specifics and
    performance of these approaches are examined with respect to the MIPS
    processor.", 
  location     = "http://dx.doi.org/10.1145/800050.801820"
}

@Article{cgfpp,
  author       = "Rymarczyk, James~W.",
  title        = "Coding Guidlines for Pipelined Processors",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "12--19",
  month        = mar,
  abstract     = "This paper is a tutorial for assembly language programmers of
    pipelined processors.  It describes the general characteristics of
    pipelined processors and presents a collection of coding guidelines for
    them.  These guidelines are particularly significant to compiler developers
    who determine object code patterns.", 
  keywords     = "pipeline architectures, interlocks, stalls",
  location     = "http://dx.doi.org/10.1145/964750.801821"
}

@Article{ohmmdt,
  author       = "John~L. Gieser",
  title        = "On Horizontal Microprogrammed Microarchitecture Description Techniques",
  journal      = tse,
  year         = 1982,
  volume       = 8,
  number       = 5,
  pages        = "513--525",
  month        = sep,
  keywords     = "automatic microcode generation, high-level microprogramming
    language, microengine description techniques, microprogrammed
    architectures, microprogramming", 
  abstract     = "In automatically generating microcode starting from a 
    high-level source language, a significant issue is the description of the
    target microengine architecture.  The techniques and methodologies used to
    accomplish this address the practical issues of: 1) a detailed description
    of all microprogram controJled haudware elements of the microengine, the
    microinstruction, the rules for valid use of all microprogrammed features,
    and the behavior of microprogrammed operations; and 2) the use of this
    description to interpret and decode higher level source intermediate
    languages to form microoperations and ultimately microinstructions.  This
    work is a step in conceptually defining the techniques and methodologies
    for microarchitecture descriptions to accomplish the above.  Its objective
    is to identify the techniques that appear to have the most promise for use
    in interjecting the target microarchitecture characteristics into the
    high-level language-to-microcode compilation process.", 
  location     = "http://dx.doi.org/10.1109/TSE.1982.235739"
}

@Article{rkwr,
  author       = "Kyle Rankin",
  title        = "Remaster {K}noppix without Remastering",
  journal      = "Linux Journal",
  year         = 2008,
  number       = 170,
  pages        = "84--88",
  month        = jun,
  keywords     = "knoppix, remastering, live systems",
  location     = "http://www.linuxjournal.com/magazine/remaster-knoppix-without-remastering"
}

@Article{tosalsfotb3m,
  author       = "Alan~D. Berenbaum and Michael~W. Condry and Priscilla~M. Lu",
  title        = "The Operating System and Languages Support Features of the {BELLMAC}-32 Microprocessor",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "30--38",
  month        = mar,
  keywords     = "microprocessor architecture, programming language support,
    operating system support, compiler support",
  abstract     = "The BELLMAC-32 microprocessor is a 32-bit microprocessor, 
    implemented with CMOS technology, designed to support operating system
    functions and high level languages efficiently.  The architecture was
    designed with the following objectives in mind:  High performance.
    Enhanced operating system support capabilities.  High level language
    support.  High reliability, availability and maintainability.",
  OPTlocation  = ""
}

@Article{dcopt,
  author       = "James {Archer, Jr.} and Richard Conway",
  title        = "Display Condensation of Program Text",
  journal      = tse,
  year         = 1982,
  volume       = 8,
  number       = 5,
  pages        = "526--529",
  month        = sep,
  keywords     = "interactive programming, prettyprinting, programming
    environments, programming methodology, text editing, human factors",
  abstract     = "In interactive systems that must display the text of 
    programs, the size of the program is usually much larger than the capacity
    of the screen.  While the obvious strategy is to simply choose k contiguous
    lines for display in a k-line window, in some cases it is useful to be able
    to represent m lines in a k-line window, where m > k, by condensing
    portions of the text.  This paper is concerned with alternative strategies
    for controlling such condensation.", 
  location     = "http://dx.doi.org/10.1109/TSE.1982.235876"
}

@Article{sotufs,
  author       = "Carroll Morgan and Bernard Sufrin",
  title        = "Specification of the " # unix # " Filing System",
  journal      = tse,
  year         = 1984,
  volume       = 10,
  number       = 2,
  pages        = "128--142",
  month        = mar,
  keywords     = "documentation, mathematical specifications, set theory, unix,
    file system semantics, z",
  abstract     = "A specification of the UNIX filing system is given using a 
    notation based on elementary mathematical set theory.  The notation used
    involves very few special constructs of its own.  The specification is
    detailed enough to capture the filing system's behavior at the system call
    level, yet abstracts from issues of data representation, whether in
    programs or on the storage medium, and from the description of any
    algorithms which might be used to implement the system.  The presentation
    of the specification is in several stages, each new stage building on its
    predecessors; major concepts are introduced separately so that they may be
    easily understood.  The notation used allows these separate stages to be
    joined together to give a complete description of each filing system
    operation-including its error conditions.  Features of the specification
    notation are explained as they are used, and the Appendix gives the
    definitions of the symbols drawn from set theory.", 
  location     = "http://dx.doi.org/10.1109/TSE.1984.5010215"
}

@Article{aootmpa,
  author       = "Johnsson, Richard~K. and Wick, John~D.",
  title        = "An Overview of the {M}esa Processor Architecture",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "20--29",
  month        = mar,
  keywords     = "instruction-set design, stack architectures, process
    management, hardware-software co-design",
  abstract     = "This paper provides an overview of the architecture of the 
    Mesa processor, an architecture which was designed to support the Mesa
    programming system.  Mesa is a high level systems programming language and
    associated tools designed to support the development of large information
    processing applications (on the order of one million source lines).  Since
    the start of development in 1971, the processor architecture, the
    programming language, and the operating system have been designed as a
    unit, so that proper tradeoffs among these components could be made.", 
  location     = "http://dx.doi.org/10.1145/800050.801822"
}

@Article{t8mgr,
  author       = "George Rudin",
  title        = "The 801 Minicomputer",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "39--47",
  month        = mar,
  keywords     = "hardware-software co-design, compilation, risc",
  abstract     = "This paper provides an overview of an experimental system
    developed at the IBM T. J. Watson Research Center.  It consists of a
    running hardware prototype, a control program and an optimizing compiler.
    The basic concepts underlying the system are discussed as are the
    performance characteristics of the prototype.  In particular, three
    principles are examined: system orientation towards the pervasive use of
    high level language programming and a sophisticated compiler, a primitive
    instruction set which can be completely hard-wired, storage hierarchy and
    I/O organization to enable the CPU to execute an instruction at almost
    every cycle.", 
  location     = "http://dx.doi.org/10.1145/800050.801824"
}

@Article{rafftcmsc,
  author       = "David~R. Ditzel and H.~R. McLellan",
  title        = "Register Allocation for Free:  The {C} Machine Stack Cache",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "48--56",
  month        = mar,
  keywords     = "cpu architecture, call sequences, compilation,
    hardware-software co-design, stack design, system performance",
  abstract     = "The Bell Labs C Machine project is investigating computer
    architectures to support the C programming language. One of the goals is
    to match an efficient architecture to the language and the compiler
    technology available.  Measurements of different C programs show that
    roughly one out of every twenty instructions executed is either a procedure
    call or return. Procedure call overhead is therefore a very important
    consideration in the overall machine design.  A second and related area of
    primary concern in overall machine efficiency is the register allocation
    strategy.  While use of additional registers can offer considerable
    improvement in execution times, adding registers usually has the adverse
    effects of increasing the procedure call overhead due to register saving
    and creating an undue burden on the compiler.  In this paper we describe a
    piece of the C Machine architecture which effectively eliminates the
    register allocation problem, and improves procedure calling by drastically
    reducing storage references required by traditional register saving.  The
    technique can be generalized for other languages and architectures, though
    we will only directly address those issues involving the C language.", 
  location     = ""
}

@Article{trdoasvcp,
  author       = "Ian~D. Cottam",
  title        = "The Rigorous Development of a System Version Control Program",
  journal      = tse,
  year         = 1984,
  volume       = 10,
  number       = 2,
  pages        = "143--154",
  month        = mar,
  keywords     = "formal specification, program proving, software development
    environment, version control",
  abstract     = "A rigorous approach to software development is followed in 
    developing a program to control the various components and versions of
    systems.  This particular approach to systematic program development is
    known as the Vienna Development Method (VDM).  This paper documerits the
    author's early experiences with VDM on a small, yet nontrivial,
    application.  The functional specification of the version control system is
    presented in detail.  Design decisions taken for a prototype implementation
    are also included.  The version control program developed is based upon the
    Gandalf System Version Control Environment of Carnegie-Mellon University.
    Both that system and the subject of this case study support the most common
    forms of component interdependency relations, and methods of system
    evolution.", 
  location     = "http://dx.doi.org/10.1109/TSE.1984.50102161"
}

@Article{aaatoc,
  author       = "Samuel~P. Harbison",
  title        = "An Architectural Alternative to Optimizing Compilers",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "57--65",
  month        = mar,
  keywords     = "machine architecture, stack architecture, value caching",
  abstract     = "Programming languages are designed to make programming
    productive.  Computer architectures are designed to make program execution
    efficient.  Although architectures should be designed with programming
    languages in mind, it may be as inappropriate to make the computer execute
    the programming language directly it is to make the programmer use machine
    language.  It is the compiler's job to match the programming language and
    the computer architectures, and therefore making compiler's efficient and
    easy to write are important design goals of a complete hardware/software
    system.  This paper summerizes research completed in 1980 on a computer
    architecture, TM, that takes over some of the more burdensome tasks of
    optimizing compilers for high-level-languages (HLL's), performing these
    tasks dynamically during the execution of the object program.  This is a
    different approach to making compilers efficient than is commonly taken;
    more common approaches include devising more efficient optimization
    algorithms, being clever about when to do optimizations, and building the 
    compilers semiautomatically.", 
  location     = "http://dx.doi.org/10.1145/800050.801826"
}

@Article{fpcbwl,
  author       = "Butler~W. Lampson",
  title        = "Fast Procedure Calls",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "66--76",
  month        = mar,
  keywords     = "architecture, call, frame, procedure, registers, stack,
    control transfer",
  abstract     = "A mechanism for control transfers should handle a variety of 
    applications (e.g., procedure calls and returns, coroutine transfers,
    exceptions, process switches) in a uniform way.  It should also allow an
    implementation in which the common cases of procedure call and return are
    extremely fast, preferably as fast as unconditional jumps in the normal
    case.  This paper describes such a mechanism and methods for its efficient
    implementation.", 
  location     = "http://dx.doi.org/10.1145/800050.801827"
}

@Article{s4assads,
  author       = "Friedrich~W. Beichter and Otthein Herzog and Heiko Petzsch",
  title        = "{SLAN}-4---{A} Software Specification and Design Software",
  journal      = tse,
  year         = 1984,
  volume       = 10,
  number       = 2,
  pages        = "155--162",
  month        = mar,
  keywords     = "specification language, axiomatic specifications, algebraic
    specifications", 
  abstract     = "SLAN-4 (Software Language-4) was developed to meet the need
    for a formal tool for specifying and designing large software systems.  It
    provides language constructs for algebraic and axiomatic specifications and
    also pseudocode constructs for the design step.  A major design goal was to
    ease subsequent refinements of a (given) specification.  The design can
    start with a very informal specification, which can be implemented later
    using lower level concepts.  This paper gives an overview of the SLAN-4
    syntax and semantics.  It concentrates on the most important aspects of:
    abstract data types, algebraic specification of abstract data types, and
    axiomatic specification of modules.  Because the pseudocode part of SLAN-4
    consists mainly of control structures similar to those in modern high-level
    programming languages, this element of the language is not separately
    described.  The paper includes an example of how to use SLAN-4, and also
    the experiences gained in using the language to formally specify a
    real-world software product of about 18 000 lines of code written in an IBM
    internal high-level language.", 
  location     = "http://dx.doi.org/10.1109/TSE.1984.5010217"
}

@Article{spmd,
  author       = "Douglas~W. Jones",
  title        = "Systematic Protection Mechanism Design",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "77--80",
  month        = mar,
  keywords     = "protection, ada, capabilities, architecture design",
  abstract     = "This work describes an attempt to systematically design a 
    hardware resource protection mechanism when given the requirements of a
    particular language as a target.  The design process is formalized as a
    structured walk through the multidimensional computer design space towards
    a hypothetical class of optimal machines.  Each step in this walk involves
    a change in the distribution of work between the compiler and run-time
    system but no change in the source language semantics.  The starting point
    for this walk is the result of a semantic analysis of the language to be
    implemented; typically, this produces a very high level machine where the
    compiler, if any, is trivial.  The walk ends when no changes result in a
    net improvement.  This does not guarantee that the result is even locally
    optimal, since the changes tried depend on the ingenuity and persistence of
    the designer.  This design approach has been used to arrive at a practical,
    general purpose protection mechanism oriented towards the needs of the Ada
    language (preliminary version).  This architecture was evaluated by
    comparing it with the PDP-11/45.  For the purpose of this comparison, the
    protection mechanism was incorporated into a partially specified PDP-11
    like instruction set.  The number of bits making up the processor state and
    the number of operations involved in address computation were evaluated.
    On this basis, the result appears to be competitive and worth further
    investigation.", 
  location     = "http://dx.doi.org/10.1145/800050.801828"
}

@Article{oagpommt,
  author       = "Karl Reed",
  title        = "On a General Property of Memory Mapping Tables",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "81--86",
  month        = mar,
  keywords     = "memory mapping, page tables, display, segmentation, virtual
    memory",
  abstract     = "The paper shows that memory mapping tables can be used to 
    implement the display registers used in providing architectural support for
    block-structured languages such as Algol 60.  This allows full lexical
    level addressing to be implemented on so-called von-Neuman machines.  The
    problems of fragmentation of the paged address space are explored, and
    machines with memory mapping schemes capable of supporting the proposals
    identified.  Attention is drawn to the similarity between segmented and
    paged schemes, and it is suggested that the latter may be used to support
    the former.", 
  location     = "http://dx.doi.org/10.1145/800050.801829"
}

@Article{aetioa,
  author       = "Cook, Robert~P. and Donde, Nitin",
  title        = "An Experiment to Improve Operand Addressing",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "87--91",
  month        = mar,
  abstract     = "MCODE is a high-level language, stack machine designed to 
    support strongly-typed, Pascal-based languages with a variety of data types
    in a modular programming environment.  The instruction set, constructed for
    efficiency and extensibility, is based on an analysis of 120,000 lines of
    Pascal programs.  The design was compared for efficiency with the
    instruction sets of the Digital Equipment PDP-11 and VAX by examining the
    generated code from the same compiler for all three machines.  In addition,
    the original design choices were tested by analyzing the generated code
    from 19,000 lines of StarMod programs.  As a result of this iterative
    experiment, we have summarized our observations in an efficient
    reorganization of the VAX's addressing modes.", 
  keywords     = "stack machine, computer architecture, addressing modes",
  location     = "http://dx.doi.org/10.1145/800050.801830"
}

@Article{opbi,
  author       = "Wladyslaw~M. Turski",
  title        = "On Programming by Iterations",
  journal      = tse,
  year         = 1984,
  volume       = 10,
  number       = 2,
  pages        = "175--178",
  month        = mar,
  abstract     = "Iterative computations are considered in this paper as a 
    general problem-solving technique. The loop invariant is derived from
    problem properties rather than from program properties (as is usual in
    programming literature). To this end, the notion of equisolution states-a
    special subset of space-state in which lie the iterated trajectories-is
    introduced.",
  keywords     = "axiomatic semantics, iterations, loop invariants, program
    derivation, problem solving",
  location     = ""
}

@Article{ccahioc,
  author       = "Fusaoka, Akira and Hirayama, Masaharu",
  title        = "Compiling Chip:  {A} Hardware Implementation of Compiler",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "92--95",
  month        = mar,
  abstract     = "In this paper we discuss about another approch: Compiler 
    Chip, which is a VLSI implementation of a compiler.  Constructing a
    compiler by a few VLSI chip, the computer manufacturer can deliver
    compilers by sets of VLSI chips, and these chips are installed in a
    intelligent terminal in order to remove the compilation from the tasks
    which are processed in the mainframe.", 
  keywords     = "compilation, pascal, compiler chips",
  location     = "http://dx.doi.org/10.1145/800050.801831"
}

@Article{faatwotp,
  author       = "Karl~K. Darrow",
  title        = "Forces and Atoms:  The World of the Physicist",
  journal      = bstj,
  year         = 1941,
  volume       = 20,
  number       = 3,
  pages        = "340--358",
  month        = jul,
  keywords     = "atoms, classical physics, quantum physics",
  abstract     = {Opening lecture of a course on “Nuclear Physics and Theory of
    Solids" delivered in the Spring semester of 1941, during the author's
    tenure of the William Allan Neilson chair at Smith College.},
  location     = "https://archive.org/details/bstj20-3-340"
}

@Article{carpfc,
  author       = "Flaviu Cristian",
  title        = "Correct and Robust Programs",
  journal      = tse,
  year         = 1984,
  volume       = 10,
  number       = 2,
  pages        = "163--174",
  month        = mar,
  keywords     = "exception handling, program robustness, structured
    programming, total correctness, weakest preconditions, language design",
  abstract     = "The design of programs which are both correct and robust is 
    investigated.  It is argued that the notion of an exception is a valuable
    tool for structuring the specification, design, verification, and
    modification of such programs.  The syntax and semantics of a language with
    procedures and exception handling are presented.  A deductive system is
    proposed for proving total correctness and robustness properties of
    programs written in this language.  The system is both sound and complete.
    It supports proof modularization, in that it allows one to reason
    separately about fault-free and fault-tolerant system properties.  Since
    the programming languages considered closely resembles CLU or Ada, the
    presented deductive system is easily adaptable for verifying total
    correctness and robustness properties of programs written in these, or
    similar, languages.",
  location     = "http://dx.doi.org/10.1109/TSE.1984.5010218"
}

@Article{ccahdocst,
  author       = "Broomell, George and Heath, J.~Robert",
  title        = "Classification Categories and Historical Development of Circuit Switching Topologies",
  journal      = surveys,
  year         = 1983,
  volume       = 15,
  number       = 2,
  pages        = "95--133",
  month        = jun,
  keywords     = "circuit switching, computers, distributed-parallel
    processing, interconnection networks, switching topologies, clos networks,
    shuffle-exchange networks, benes networks, banyon networks",
  abstract     = "",
  location     = "http://dx.doi.org/10.1145/356909.356912"
}

@Article{asftegocfha,
  author       = "Rau, B.~R. and Glaeser, C.~D. and Greenawalt, E.~M.",
  title        = "Architectural Support for the Efficient Generation of Code for Horizontal Architectures",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "96--99",
  month        = mar,
  keywords     = "horizontal architectures, scheduling, delays, code
    generation, interconnection networks, polycyclic architectures",
  abstract     = "Horizontal architectures, such as the CDC Advanced Flexible
    Processor and the FPS APi20-B, consist of a number of resources that can
    operate in parallel, each of which is controlled by a field in the wide
    instruction word.  Such architectures have been developed to perform high
    speed scientific computations at a modest cost: Figure 1 displays those
    characteristics of horizontal architectures that are germane to the issues
    discussed in this paper.  The simultaneous requirements of high performance
    and low cost lead to an architecture consisting of multiple pipelined
    processing elements (PEs) such as adders and multipliers, a memory (which
    for scheduling purposes may be viewed as yet another PE with two
    operations: a READ and a WRITE), and an interconnect which ties them all
    together.  The interconnect allows the result of one operation to be
    directly routed to another PE as one of the inputs for an operation that is
    to be performed there.  The required memory bandwidth is reduced since
    temporary values need not be written to and read from the memory.  The
    final aspect of horizontal processors that is of interest is that their
    program memories emit wide instructions which synchronously specify the
    actions of the multiple and possibly dissimilar PEs.  The program memory is
    sequenced by a conventional sequencer that assumes sequential flow of
    control unless a branch is explicitly specified.  As a consequence of the
    simplicity of such an architecture, it is inexpensive relative to the
    potential performance of the multiple pipelined PEs.  However, if this
    potential performance is to be realized, the multiple resources of a
    horizontal processor must be scheduled effectively.  The scheduling task
    for conventional horizontal processors is quite complex and the
    construction of highly optimizing compilers for them is a difficult and
    expensiw3 project.  The polycyclic architecture is a horizontal
    architecture with architectural support for the scheduling task.  The cause
    of the complexity involved in scheduling conventional horizontal processors
    and the manner in which the polycyclic architecture addresses this issue
    are outlined in this paper.", 
  location     = "http://dx.doi.org/10.1145/800050.801832"
}

@Article{cadcmc,
  author       = "Abraham Silberschatz",
  title        = "Cell: {A} Distributed Computing Modularization Concept",
  journal      = tse,
  year         = 1984,
  volume       = 10,
  number       = 2,
  pages        = "178--185",
  month        = mar,
  keywords     = "communication, distributed systems, programming languages,
    process scheduling, program synchronization",
  abstract     = "This paper presents a new language construct for distributed
    computing.  This construct, called cell, allows one to simulate a variety
    of language constructs, Its salient features provide the programmer with:
    1) an effective communication and synchronization scheme, 2) a mechanism to
    control the order in which various activities within a cell should be
    executed.  We demonstrate the usefulness of our concepts by providing
    solutions to a variety of programming exercises.", 
  location     = "http://dx.doi.org/10.1109/TSE.1984.5010220"
}

@Article{aaoamisudif,
  author       = "Gene McDaniel",
  title        = "An Analysis of a {M}esa Instruction Set Using Dynamic Instruction Frequencies",
  journal      = sigarch # " (" # pot # "First International Symposium on " #
    ASPLOS # " (ASPLOS I))",
  year         = 1982,
  volume       = 10,
  number       = 2,
  pages        = "167--176",
  month        = mar,
  keywords     = "microcoding, dynamic tracing, instruction counting,
    architecture design",
  abstract     = "The Mesa architecture is implemented on a variety of 
    processors, and dynamic instruction frequency data for two programs is used
    to analyze the architecture in an implementation independent fashion.  The
    Mesa compiler allocates variables in an order based upon their static
    frequency of use, and measurements are provided that show that these static
    predictions predict run time usage as well.  We provide an evaluation of
    the advantages and costs of Mesa's compact byte encoding, its reliance upon
    an evaluation stack, and its use of memory.  The Mesa language has evolved
    over time in a hardware environment oriented around 16-bit quantities with
    growing use of and accommodations to 32-bit quantities.  The cost of
    emulating 32-bit data paths on a 16-bit machine is identified for a program
    that heavily exploits longer values.  Several potential areas for improving
    the execution speed of a Mesa processor with special purpose hardware are
    identified.", 
  location     = "http://dx.doi.org/10.1145/800050.801840"
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

@TechReport{pfppgiapsi,
  author       = "Carlyn~M. Lowery",
  title        = "Protocols for Providing Performance Guarantees in a Packet-Switching Internet",
  institution  = "Computer Science Division, Department of Electrical
    Engineering and Computer Science, University of California",
  address      = bca,
  year         = 1991,
  keywords     = "quality of service, circuit switching, connection set-up,
    real-time protocols",
  abstract     = "As advances in technology enable us to implement very high
    speed computer networks, we expect to use our networks for more diverse
    applications.  While the Internet was designed with textual data processing
    in mind, future networks will carry information such as voice, music,
    images, and video, along with textual data.  Many new applications will
    have real-time performance requirements, where the timing of data arrival
    is crucial to its usefulness.  This paper describes a methodology developed
    at the University of California at Berkeley to support such applications,
    reviews related research work, and proposes a real-time delivery system,
    composed of a new protocol for administration of real-time connections,
    combined with modifications to the Internet Protocol (IP) to support such
    connections.  Transport protocol requirements are also discussed.  This
    work is intended to facilitate experiments with real-time communication
    over the Experimental University Network (XUNET).", 
  location     = "ftp://tenet.berkeley.edu/ucb/tenet/Papers/Lowery91.ps"
}

@TechReport{tcfrtcg,
  author       = "David Keppel and Susan~J. Eggers and Robert~R. Henry",
  title        = "A Case for Runtime Code Generation",
  institution  = dcse # uwash,
  year         = 1991,
  number       = "91-11-04",
  address      = swa,
  keywords     = "compilation, run-time code generation, dynamic optimization,
    computer architecture, partial evaluation, performance",
  abstract     = "We define runtime code generation (RTCG) as dynamically
    adding code to the instruction stream of an executing program.  It has been
    in use since the 1940s, but fell from favor because changing hardware and
    software technologies made it less profitabile and its ad-hoc
    implementation made it nonportable.  In this paper we argue for it's
    return.  We base our arguments on ongoing changes in hardware technology,
    software technology, and workloads.  Each of these changes brings about
    circumstances in which dynamically optimized code can execute fast enough
    to pay for the runtime overhead of creating it.  We support our analysis
    with concrete examples.  We compare static-code and RTCG implementations of
    several applications and show that RTCG leads to performance
    improvements.", 
  location     = "ftp://ftp.cs.washington.edu/tr/1991/11/UW-CSE-91-11-04.PS.Z"
}

@TechReport{otrort,
  author       = "Joan Feigenbaum and Brighten Godfrey and Aurojit Panda and Michael Schapira and Scott Shenker",
  title        = "On the Resilience of Routing Tables",
  institution  = csd # "Yale University",
  year         = 2012,
  number       = "YALEU/DCS/TR-1454",
  address      = nhco,
  month        = aug,
  keywords     = "routing, fault tolerance",
  abstract     = {Many modern network designs incorporate "failover" paths
    into routers' forwarding tables. In this paper, we formally address the
    conditions under which such resilient routing tables can guarantee delivery
    of packets.},
  location     = "http://cpsc.yale.edu/sites/default/files/files/tr1454.pdf"
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

@Book{esj,
  author       = "Steven Johnson",
  title        = "Emergence",
  publisher    = "Scribner",
  year         = 2001,
  address      = nyny,
  keywords     = "self-organizing systems, patterns, intelligence, information,
    feedback, brain, behavior, ants, cities, systems",
  location     = "Q 325 J65"
}

@Book{rojrap,
  author       = "Richard~A. Posner",
  title        = "Reflections on Judging",
  publisher    = hup,
  year         = 2013,
  address      = cma,
  keywords     = "judging, complexity, decision making, legal realism, legal
    formalism", 
  location     = "KF 9050 P55"
}

@Book{bcp,
  author       = "Cherie Priest",
  title        = "Boneshaker",
  publisher    = "Tor",
  year         = 2009,
  address      = nyny,
  keywords     = "steampunk, seattle, mining, zombies",
  location     = "PS 3616.R537 B66"
}

@Book{hust,
  author       = "Stephen Toulmin",
  title        = "Human Understanding",
  publisher    = pup,
  year         = 1972,
  volume       = 1,
  address      = prnj,
  keywords     = "rationality, concepts, reason",
  location     = "BG 177 T58"
}

@Book{lamef,
  author       = "Edward Frenkel",
  title        = "Love and Math",
  publisher    = "Basic Books",
  year         = 2013,
  address      = nyny,
  keywords     = "math, anti-semetism, education",
  location     = "QA 29 F725 F47"
}

@Book{rorfb,
  author       = "Forrest Bice and Rose DeMaio and Spencer Florence and
    Feng-Yun Mimi Lin and Scott Lindeman and Nicole Nussbaum and Eric Peterson
    and Ryan Plessner and David Van Horn and Conrad Barski and Matthias
    Felleisen",
  title        = "Realm of Racket",
  publisher    = "No Starch Press",
  year         = 2013,
  address      = sfca,
  keywords     = "scheme, game programming, programming",
  location     = "QA 76.73.R33 F45"
}

@Book{avami,
  author       = "Alasdair MacIntyre",
  title        = "After Version",
  publisher    = "University of Notre Dame Press",
  year         = 1981,
  address      = "Notre Dame, Indiana",
  keywords     = "moral disagreement, enlightenment, virtues, aristotle,
    justice, nietzsche",
  location     = "BJ 1012 M325"
}

@Book{modrn,
  title        = "Machine of Death",
  publisher    = "Bearstache Books",
  year         = 2010,
  editor       = "Ryan North and Matthew Bennardo and David Malki",
  address      = "Venice, " # CA,
  keywords     = "predestination, oracular machines",
  location     = "978-0-9821671-2-0"
}

@Book{tgarw,
  author       = "Dennis Drabelle",
  title        = "The Great American Railroad War",
  publisher    = "St. Martin's Press",
  year         = 2012,
  address      = nyny,
  keywords     = "ambrose bierce, frank norris, central pacific railway,
    transcontinental railway, corruption",
  location     = "HE 2791 C451 D73"
}

@Book{paipm,
  author       = "Nathaniel~S. Borenstein",
  title        = "Programming as if People Mattered",
  publisher    = pup,
  year         = 1991,
  address      = prnj,
  keywords     = "user interfaces, software engineering, design, testing, war
    stories",
  location     = "QA 76.758 B67"
}

@Book{ttah,
  author       = "Hannah Spahn",
  title        = "Thomas Jefferson, Time and History",
  publisher    = "University of Virginia Press",
  year         = 2011,
  address      = "Charlottesville, Virginia",
  keywords     = "time, history",
  location     = "B 885.Z7S63"
}

@Book{tpehb,
  author       = "Holly Black",
  title        = "The Poison Eaters",
  publisher    = "Margaret K. McElderry Books",
  year         = 2011,
  address      = nyny,
  keywords     = "faries, vampyers, satan",
  location     = "PZ 7.B52878"
}

@Book{miac,
  author       = "Robert {van Gulik}",
  title        = "Murder in Ancient China",
  publisher    = "Chicago University Press",
  year         = 2013,
  series       = "Chicago Shorts",
  address      = chil,
  month        = dec,
  keywords     = "a treacherous four-way, a misunderstanding based in pig's
    blood " 
}

@Book{desk,
  author       = "Steve Keen",
  title        = "Debunking Economics",
  publisher    = "Zed Books",
  year         = 2001,
  address      = loen,
  keywords     = "capitalism, neoclassical economics, marxism",
  location     = "HB 75 K32"
}

@Book{ifsgrr,
  author       = "Rob Riesman",
  title        = "I Feel So Good",
  publisher    = "University of Chicago Press",
  year         = 2011,
  address      = chil,
  keywords     = "big bill broonzy, blues, folk, music",
  location     = "ML 420 B78 R54"
}

@Book{tbobwbs,
  author       = "Benn Steil",
  title        = "The Battle of Bretton Woods",
  publisher    = pup,
  year         = 2013,
  address      = prnj,
  keywords     = "international finance, harry white, john keynes",
  location     = "HG 255 S837"
}

@Book{cmjc,
  author       = "Jefferson Cowie",
  title        = "Capital Moves",
  publisher    = "Cornell University Press",
  year         = 1999,
  address      = "Ithica, New York",
  keywords     = "capital, labor, rca, labor markets, unions, economic policy",
  location     = "HD 9696 A3 U5334"
}

@Book{efhjan,
  author       = "Julie~A. Nelson",
  title        = "Economics for Humans",
  publisher    = ucp,
  year         = 2006,
  address      = chil,
  keywords     = "economics, metaphors, history, motivation, organizational
    behavior", 
  location     = "HB 72.N445"
}

@Book{sfmsm,
  author       = "Sanjoy Mahajan",
  title        = "Street-Fighting Mathematics",
  publisher    = mitp,
  year         = 2010,
  address      = cma,
  month        = mar,
  keywords     = "problem solving, estimation, heuristics",
  location     = "QA 63.M34"
}

@Book{dofpb,
  author       = "Peter Baker",
  title        = "Days of Fire",
  publisher    = "Doubleday",
  year         = 2013,
  address      = nyny,
  keywords     = "bush, chaney, u.s. government, iraq, u.s. politics",
  location     = "E 902.B353"
}

@Book{moawop,
  author       = "John Cleland",
  title        = "Fanny Hill",
  publisher    = "Mayflower",
  year         = 1970,
  address      = loen,
  keywords     = "sex",
  location     = "PZ 3.C5887 Jo5"
}

@Book{agwl,
  author       = "William Langewiesche",
  title        = "American Ground",
  publisher    = "North Point Press",
  year         = 2002,
  address      = nyny,
  keywords     = "9/11, clean-up, tribalism",
  location     = "HV 6432 L364"
}

@Book{w40ds,
  author       = "David Sedlak",
  title        = "Water 4.0",
  publisher    = yup,
  year         = 2014,
  address      = nhco,
  keywords     = "water, water supplies, water treatment, sewage processing",
  location     = "GB 659.6 S44"
}

@Book{oigjb,
  author       = "John Brooks",
  title        = "Once in Golconda",
  publisher    = "Harper \& Row",
  year         = 1969,
  address      = nyny,
  keywords     = "wall street, the crash, finance, nyse, chicanery",
  location     = "HG 4572 B7"
}

@Book{wybdw,
  author       = "Donald Westlake",
  title        = "Watch Your Back!",
  publisher    = "Mysterious Press",
  year         = 2005,
  address      = nyny,
  keywords     = "skullduggery",
  location     = "PS 3573.E9 W17"
}

@InProceedings{amoorwpa,
  author       = "Joan Feigenbaum and Aaron Johnson and Paul Syverson",
  title        = "{A} Model of Onion Routing with Provable Anonymity",
  booktitle    = pot # "11th International Conference on Financial Cryptography",
  year         = 2007,
  editor       = "Sven Dietrich and Rachna Dhamija",
  pages        = "57--71",
  publisher    = sv,
  address      = "Scarborough, Trinidad/Tobago",
  month        = "12--16 " # feb,
  keywords     = "onion routing, io automata, ",
  abstract     = "Onion routing is a scheme for anonymous communication that is
    designed for practical use.  Until now, however, it has had no formal model
    and therefore no rigorous analysis of its anonymity guarantees.  We give an
    IO-automata model of an onion-routing protocol and, under possibilistic
    definitions, characterize the situations in which anonymity and
    unlinkability are guaranteed.", 
  location     = "http://dx.doi.org/10.1145/960120.801827"
}

