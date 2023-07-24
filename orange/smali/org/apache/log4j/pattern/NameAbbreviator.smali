.class public abstract Lorg/apache/log4j/pattern/NameAbbreviator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/pattern/NameAbbreviator$d;,
        Lorg/apache/log4j/pattern/NameAbbreviator$e;,
        Lorg/apache/log4j/pattern/NameAbbreviator$a;,
        Lorg/apache/log4j/pattern/NameAbbreviator$b;,
        Lorg/apache/log4j/pattern/NameAbbreviator$c;
    }
.end annotation


# static fields
.field public static final a:Lorg/apache/log4j/pattern/NameAbbreviator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/log4j/pattern/NameAbbreviator$c;

    invoke-direct {v0}, Lorg/apache/log4j/pattern/NameAbbreviator$c;-><init>()V

    sput-object v0, Lorg/apache/log4j/pattern/NameAbbreviator;->a:Lorg/apache/log4j/pattern/NameAbbreviator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAbbreviator(Ljava/lang/String;)Lorg/apache/log4j/pattern/NameAbbreviator;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_c

    .line 2
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 4
    sget-object p0, Lorg/apache/log4j/pattern/NameAbbreviator;->a:Lorg/apache/log4j/pattern/NameAbbreviator;

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x39

    const/16 v2, 0x30

    const/4 v3, 0x0

    if-lez v0, :cond_2

    .line 6
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x2d

    if-ne v0, v4, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_3

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v2, :cond_3

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-gt v4, v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 8
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v0, v4, :cond_5

    .line 9
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    if-ltz p0, :cond_4

    .line 10
    new-instance v0, Lorg/apache/log4j/pattern/NameAbbreviator$b;

    invoke-direct {v0, p0}, Lorg/apache/log4j/pattern/NameAbbreviator$b;-><init>(I)V

    return-object v0

    .line 11
    :cond_4
    new-instance v0, Lorg/apache/log4j/pattern/NameAbbreviator$a;

    neg-int p0, p0

    invoke-direct {v0, p0}, Lorg/apache/log4j/pattern/NameAbbreviator$a;-><init>(I)V

    return-object v0

    .line 12
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    const/4 v4, 0x5

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    .line 13
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_b

    if-ltz v4, :cond_b

    .line 14
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x2a

    if-ne v5, v6, :cond_6

    const v5, 0x7fffffff

    :goto_2
    add-int/lit8 v6, v4, 0x1

    goto :goto_3

    .line 15
    :cond_6
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v2, :cond_7

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-gt v5, v1, :cond_7

    .line 16
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    sub-int/2addr v5, v2

    goto :goto_2

    :cond_7
    move v6, v4

    const/4 v5, 0x0

    .line 17
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_8

    .line 18
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x2e

    if-ne v6, v7, :cond_9

    :cond_8
    const/4 v6, 0x0

    .line 19
    :cond_9
    new-instance v7, Lorg/apache/log4j/pattern/NameAbbreviator$e;

    invoke-direct {v7, v5, v6}, Lorg/apache/log4j/pattern/NameAbbreviator$e;-><init>(IC)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v5, "."

    .line 20
    invoke-virtual {p0, v5, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_a

    goto :goto_4

    :cond_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 21
    :cond_b
    :goto_4
    new-instance p0, Lorg/apache/log4j/pattern/NameAbbreviator$d;

    invoke-direct {p0, v0}, Lorg/apache/log4j/pattern/NameAbbreviator$d;-><init>(Ljava/util/List;)V

    return-object p0

    .line 22
    :cond_c
    sget-object p0, Lorg/apache/log4j/pattern/NameAbbreviator;->a:Lorg/apache/log4j/pattern/NameAbbreviator;

    return-object p0
.end method

.method public static getDefaultAbbreviator()Lorg/apache/log4j/pattern/NameAbbreviator;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/pattern/NameAbbreviator;->a:Lorg/apache/log4j/pattern/NameAbbreviator;

    return-object v0
.end method


# virtual methods
.method public abstract abbreviate(ILjava/lang/StringBuffer;)V
.end method
