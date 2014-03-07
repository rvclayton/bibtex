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

