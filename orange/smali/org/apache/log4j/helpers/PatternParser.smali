.class public Lorg/apache/log4j/helpers/PatternParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/helpers/PatternParser$b;,
        Lorg/apache/log4j/helpers/PatternParser$c;,
        Lorg/apache/log4j/helpers/PatternParser$h;,
        Lorg/apache/log4j/helpers/PatternParser$f;,
        Lorg/apache/log4j/helpers/PatternParser$g;,
        Lorg/apache/log4j/helpers/PatternParser$d;,
        Lorg/apache/log4j/helpers/PatternParser$e;,
        Lorg/apache/log4j/helpers/PatternParser$a;
    }
.end annotation


# static fields
.field public static synthetic i:Ljava/lang/Class;


# instance fields
.field public a:I

.field public b:Ljava/lang/StringBuffer;

.field public c:I

.field public d:I

.field public e:Lorg/apache/log4j/helpers/PatternConverter;

.field public f:Lorg/apache/log4j/helpers/PatternConverter;

.field public g:Lorg/apache/log4j/helpers/FormattingInfo;

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    .line 3
    new-instance v0, Lorg/apache/log4j/helpers/FormattingInfo;

    invoke-direct {v0}, Lorg/apache/log4j/helpers/FormattingInfo;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    .line 4
    iput-object p1, p0, Lorg/apache/log4j/helpers/PatternParser;->h:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Lorg/apache/log4j/helpers/PatternParser;->c:I

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 6
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    iget v1, p0, Lorg/apache/log4j/helpers/PatternParser;->c:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lorg/apache/log4j/helpers/PatternParser;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x7b

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->h:Ljava/lang/String;

    const/16 v1, 0x7d

    iget v2, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 3
    iget v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    if-le v0, v1, :cond_0

    .line 4
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->h:Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    .line 5
    iput v0, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(C)V
    .locals 4

    const/16 v0, 0x43

    const/4 v1, 0x0

    if-eq p1, v0, :cond_11

    const/16 v0, 0x46

    if-eq p1, v0, :cond_10

    const/16 v0, 0x58

    if-eq p1, v0, :cond_f

    const/16 v0, 0x70

    if-eq p1, v0, :cond_e

    const/16 v0, 0x72

    if-eq p1, v0, :cond_d

    const/16 v0, 0x74

    if-eq p1, v0, :cond_c

    const/16 v0, 0x78

    if-eq p1, v0, :cond_b

    const/16 v0, 0x4c

    if-eq p1, v0, :cond_a

    const/16 v0, 0x4d

    if-eq p1, v0, :cond_9

    const/16 v0, 0x63

    if-eq p1, v0, :cond_8

    const/16 v0, 0x64

    if-eq p1, v0, :cond_2

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x6d

    if-eq p1, v0, :cond_0

    .line 7
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Unexpected char ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const-string p1, "] at position "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget p1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string p1, " in conversion patterrn."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    .line 8
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$e;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/apache/log4j/helpers/PatternParser$e;-><init>(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto/16 :goto_3

    .line 10
    :cond_0
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$a;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    const/16 v2, 0x7d4

    invoke-direct {p1, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$a;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 11
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto/16 :goto_3

    .line 12
    :cond_1
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$f;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    const/16 v2, 0x3e8

    invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$f;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 13
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto/16 :goto_3

    .line 14
    :cond_2
    invoke-virtual {p0}, Lorg/apache/log4j/helpers/PatternParser;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ISO8601"

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move-object p1, v0

    .line 15
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 16
    new-instance p1, Lorg/apache/log4j/helpers/ISO8601DateFormat;

    invoke-direct {p1}, Lorg/apache/log4j/helpers/ISO8601DateFormat;-><init>()V

    goto :goto_1

    :cond_4
    const-string v0, "ABSOLUTE"

    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 18
    new-instance p1, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;

    invoke-direct {p1}, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;-><init>()V

    goto :goto_1

    :cond_5
    const-string v0, "DATE"

    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 20
    new-instance p1, Lorg/apache/log4j/helpers/DateTimeDateFormat;

    invoke-direct {p1}, Lorg/apache/log4j/helpers/DateTimeDateFormat;-><init>()V

    goto :goto_1

    .line 21
    :cond_6
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 22
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Could not instantiate SimpleDateFormat with "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    sget-object p1, Lorg/apache/log4j/helpers/PatternParser;->i:Ljava/lang/Class;

    if-nez p1, :cond_7

    const-string p1, "java.text.DateFormat"

    invoke-static {p1}, Lorg/apache/log4j/helpers/PatternParser;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    sput-object p1, Lorg/apache/log4j/helpers/PatternParser;->i:Ljava/lang/Class;

    :cond_7
    const/4 v0, 0x0

    const-string v2, "org.apache.log4j.helpers.ISO8601DateFormat"

    invoke-static {v2, p1, v0}, Lorg/apache/log4j/helpers/OptionConverter;->instantiateByClassName(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/text/DateFormat;

    .line 24
    :goto_1
    new-instance v0, Lorg/apache/log4j/helpers/PatternParser$d;

    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    invoke-direct {v0, v2, p1}, Lorg/apache/log4j/helpers/PatternParser$d;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;Ljava/text/DateFormat;)V

    .line 25
    iget-object p1, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto/16 :goto_2

    .line 26
    :cond_8
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$b;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    invoke-virtual {p0}, Lorg/apache/log4j/helpers/PatternParser;->b()I

    move-result v2

    invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$b;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 27
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto/16 :goto_3

    .line 28
    :cond_9
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$f;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    const/16 v2, 0x3e9

    invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$f;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 29
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto/16 :goto_3

    .line 30
    :cond_a
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$f;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    const/16 v2, 0x3eb

    invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$f;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 31
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto :goto_3

    .line 32
    :cond_b
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$a;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    const/16 v2, 0x7d3

    invoke-direct {p1, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$a;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 33
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto :goto_3

    .line 34
    :cond_c
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$a;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    const/16 v2, 0x7d1

    invoke-direct {p1, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$a;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 35
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto :goto_3

    .line 36
    :cond_d
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$a;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    const/16 v2, 0x7d0

    invoke-direct {p1, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$a;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 37
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto :goto_3

    .line 38
    :cond_e
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$a;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    const/16 v2, 0x7d2

    invoke-direct {p1, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$a;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 39
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto :goto_3

    .line 40
    :cond_f
    invoke-virtual {p0}, Lorg/apache/log4j/helpers/PatternParser;->a()Ljava/lang/String;

    move-result-object p1

    .line 41
    new-instance v0, Lorg/apache/log4j/helpers/PatternParser$g;

    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    invoke-direct {v0, v2, p1}, Lorg/apache/log4j/helpers/PatternParser$g;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;Ljava/lang/String;)V

    .line 42
    iget-object p1, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    :goto_2
    move-object p1, v0

    goto :goto_3

    .line 43
    :cond_10
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$f;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    const/16 v2, 0x3ec

    invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$f;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 44
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    goto :goto_3

    .line 45
    :cond_11
    new-instance p1, Lorg/apache/log4j/helpers/PatternParser$c;

    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    invoke-virtual {p0}, Lorg/apache/log4j/helpers/PatternParser;->b()I

    move-result v2

    invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$c;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V

    .line 46
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 47
    :goto_3
    invoke-virtual {p0, p1}, Lorg/apache/log4j/helpers/PatternParser;->a(Lorg/apache/log4j/helpers/PatternConverter;)V

    return-void
.end method

.method public a(Lorg/apache/log4j/helpers/PatternConverter;)V
    .locals 2

    .line 48
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 49
    invoke-virtual {p0, p1}, Lorg/apache/log4j/helpers/PatternParser;->b(Lorg/apache/log4j/helpers/PatternConverter;)V

    .line 50
    iput v1, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I

    .line 51
    iget-object p1, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    invoke-virtual {p1}, Lorg/apache/log4j/helpers/FormattingInfo;->a()V

    return-void
.end method

.method public b()I
    .locals 5

    .line 5
    invoke-virtual {p0}, Lorg/apache/log4j/helpers/PatternParser;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 6
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    if-gtz v2, :cond_0

    .line 7
    :try_start_1
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "Precision option ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v4, ") isn\'t a positive integer."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v2

    move-object v1, v2

    const/4 v2, 0x0

    .line 8
    :goto_0
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "Category option \""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "\" not a decimal integer."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    move v1, v2

    :cond_1
    :goto_1
    return v1
.end method

.method public final b(Lorg/apache/log4j/helpers/PatternConverter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->e:Lorg/apache/log4j/helpers/PatternConverter;

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lorg/apache/log4j/helpers/PatternParser;->f:Lorg/apache/log4j/helpers/PatternConverter;

    iput-object p1, p0, Lorg/apache/log4j/helpers/PatternParser;->e:Lorg/apache/log4j/helpers/PatternConverter;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->f:Lorg/apache/log4j/helpers/PatternConverter;

    iput-object p1, v0, Lorg/apache/log4j/helpers/PatternConverter;->next:Lorg/apache/log4j/helpers/PatternConverter;

    .line 4
    iput-object p1, p0, Lorg/apache/log4j/helpers/PatternParser;->f:Lorg/apache/log4j/helpers/PatternConverter;

    :goto_0
    return-void
.end method

.method public parse()Lorg/apache/log4j/helpers/PatternConverter;
    .locals 9

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    .line 2
    :goto_0
    iget v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    iget v2, p0, Lorg/apache/log4j/helpers/PatternParser;->c:I

    if-ge v1, v2, :cond_11

    .line 3
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->h:Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 4
    iget v2, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I

    const/4 v3, 0x1

    if-eqz v2, :cond_b

    const/16 v4, 0x2e

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/16 v7, 0x39

    const/16 v8, 0x30

    if-eq v2, v3, :cond_7

    const/4 v3, 0x5

    if-eq v2, v6, :cond_5

    if-eq v2, v5, :cond_2

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    if-lt v1, v8, :cond_1

    if-gt v1, v7, :cond_1

    .line 6
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    iget v3, v2, Lorg/apache/log4j/helpers/FormattingInfo;->b:I

    mul-int/lit8 v3, v3, 0xa

    add-int/lit8 v1, v1, -0x30

    add-int/2addr v3, v1

    iput v3, v2, Lorg/apache/log4j/helpers/FormattingInfo;->b:I

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0, v1}, Lorg/apache/log4j/helpers/PatternParser;->a(C)V

    .line 8
    iput v0, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I

    goto :goto_0

    .line 9
    :cond_2
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    if-lt v1, v8, :cond_3

    if-gt v1, v7, :cond_3

    .line 10
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    iget v3, v2, Lorg/apache/log4j/helpers/FormattingInfo;->a:I

    mul-int/lit8 v3, v3, 0xa

    add-int/lit8 v1, v1, -0x30

    add-int/2addr v3, v1

    iput v3, v2, Lorg/apache/log4j/helpers/FormattingInfo;->a:I

    goto :goto_0

    :cond_3
    if-ne v1, v4, :cond_4

    .line 11
    iput v6, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I

    goto :goto_0

    .line 12
    :cond_4
    invoke-virtual {p0, v1}, Lorg/apache/log4j/helpers/PatternParser;->a(C)V

    goto :goto_0

    .line 13
    :cond_5
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    if-lt v1, v8, :cond_6

    if-gt v1, v7, :cond_6

    .line 14
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    add-int/lit8 v1, v1, -0x30

    iput v1, v2, Lorg/apache/log4j/helpers/FormattingInfo;->b:I

    .line 15
    iput v3, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I

    goto :goto_0

    .line 16
    :cond_6
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Error occured in position "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v3, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v3, ".\n Was expecting digit, instead got char \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const-string v1, "\"."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    .line 17
    iput v0, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I

    goto/16 :goto_0

    .line 18
    :cond_7
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const/16 v2, 0x2d

    if-eq v1, v2, :cond_a

    if-eq v1, v4, :cond_9

    if-lt v1, v8, :cond_8

    if-gt v1, v7, :cond_8

    .line 19
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    add-int/lit8 v1, v1, -0x30

    iput v1, v2, Lorg/apache/log4j/helpers/FormattingInfo;->a:I

    .line 20
    iput v5, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I

    goto/16 :goto_0

    .line 21
    :cond_8
    invoke-virtual {p0, v1}, Lorg/apache/log4j/helpers/PatternParser;->a(C)V

    goto/16 :goto_0

    .line 22
    :cond_9
    iput v6, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I

    goto/16 :goto_0

    .line 23
    :cond_a
    iget-object v1, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    iput-boolean v3, v1, Lorg/apache/log4j/helpers/FormattingInfo;->c:Z

    goto/16 :goto_0

    .line 24
    :cond_b
    iget v2, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    iget v4, p0, Lorg/apache/log4j/helpers/PatternParser;->c:I

    if-ne v2, v4, :cond_c

    .line 25
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    :cond_c
    const/16 v4, 0x25

    if-ne v1, v4, :cond_10

    .line 26
    iget-object v5, p0, Lorg/apache/log4j/helpers/PatternParser;->h:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v4, :cond_f

    const/16 v4, 0x6e

    if-eq v2, v4, :cond_e

    .line 27
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v2

    if-eqz v2, :cond_d

    .line 28
    new-instance v2, Lorg/apache/log4j/helpers/PatternParser$e;

    iget-object v4, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lorg/apache/log4j/helpers/PatternParser$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lorg/apache/log4j/helpers/PatternParser;->b(Lorg/apache/log4j/helpers/PatternConverter;)V

    .line 29
    :cond_d
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 30
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 31
    iput v3, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I

    .line 32
    iget-object v1, p0, Lorg/apache/log4j/helpers/PatternParser;->g:Lorg/apache/log4j/helpers/FormattingInfo;

    invoke-virtual {v1}, Lorg/apache/log4j/helpers/FormattingInfo;->a()V

    goto/16 :goto_0

    .line 33
    :cond_e
    iget-object v1, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    sget-object v2, Lorg/apache/log4j/Layout;->LINE_SEP:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 34
    iget v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    add-int/2addr v1, v3

    iput v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    goto/16 :goto_0

    .line 35
    :cond_f
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 36
    iget v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    add-int/2addr v1, v3

    iput v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I

    goto/16 :goto_0

    .line 37
    :cond_10
    iget-object v2, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    .line 38
    :cond_11
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-eqz v0, :cond_12

    .line 39
    new-instance v0, Lorg/apache/log4j/helpers/PatternParser$e;

    iget-object v1, p0, Lorg/apache/log4j/helpers/PatternParser;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/log4j/helpers/PatternParser$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lorg/apache/log4j/helpers/PatternParser;->b(Lorg/apache/log4j/helpers/PatternConverter;)V

    .line 40
    :cond_12
    iget-object v0, p0, Lorg/apache/log4j/helpers/PatternParser;->e:Lorg/apache/log4j/helpers/PatternConverter;

    return-object v0
.end method
