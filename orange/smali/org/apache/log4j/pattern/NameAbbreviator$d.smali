.class public Lorg/apache/log4j/pattern/NameAbbreviator$d;
.super Lorg/apache/log4j/pattern/NameAbbreviator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/log4j/pattern/NameAbbreviator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final b:[Lorg/apache/log4j/pattern/NameAbbreviator$e;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/pattern/NameAbbreviator;-><init>()V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lorg/apache/log4j/pattern/NameAbbreviator$e;

    iput-object v0, p0, Lorg/apache/log4j/pattern/NameAbbreviator$d;->b:[Lorg/apache/log4j/pattern/NameAbbreviator$e;

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "fragments must have at least one element"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public abbreviate(ILjava/lang/StringBuffer;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lorg/apache/log4j/pattern/NameAbbreviator$d;->b:[Lorg/apache/log4j/pattern/NameAbbreviator$e;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 2
    iget-object v1, p0, Lorg/apache/log4j/pattern/NameAbbreviator$d;->b:[Lorg/apache/log4j/pattern/NameAbbreviator$e;

    aget-object v1, v1, v0

    invoke-virtual {v1, p2, p1}, Lorg/apache/log4j/pattern/NameAbbreviator$e;->a(Ljava/lang/StringBuffer;I)I

    move-result p1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/pattern/NameAbbreviator$d;->b:[Lorg/apache/log4j/pattern/NameAbbreviator$e;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    .line 4
    :goto_1
    invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    if-ge p1, v1, :cond_1

    if-ltz p1, :cond_1

    .line 5
    invoke-virtual {v0, p2, p1}, Lorg/apache/log4j/pattern/NameAbbreviator$e;->a(Ljava/lang/StringBuffer;I)I

    move-result p1

    goto :goto_1

    :cond_1
    return-void
.end method
