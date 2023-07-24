.class public Lorg/apache/log4j/helpers/CyclicBuffer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[Lorg/apache/log4j/spi/LoggingEvent;

.field public b:I

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    .line 2
    iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I

    .line 3
    new-array p1, p1, [Lorg/apache/log4j/spi/LoggingEvent;

    iput-object p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    .line 5
    iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I

    .line 6
    iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I

    return-void

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "The maxSize argument ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string p1, ") is not a positive integer."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public add(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    iget v1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 2
    iput v1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I

    iget p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I

    const/4 v0, 0x0

    if-ne v1, p1, :cond_0

    .line 3
    iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I

    .line 4
    :cond_0
    iget p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I

    iget v1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I

    if-ge p1, v1, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 5
    iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I

    goto :goto_0

    .line 6
    :cond_1
    iget p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    if-ne p1, v1, :cond_2

    .line 7
    iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    :cond_2
    :goto_0
    return-void
.end method

.method public get()Lorg/apache/log4j/spi/LoggingEvent;
    .locals 4

    .line 3
    iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I

    const/4 v1, 0x0

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    .line 4
    iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I

    .line 5
    iget-object v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    iget v2, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    aget-object v3, v0, v2

    .line 6
    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    .line 7
    iput v2, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I

    if-ne v2, v0, :cond_0

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    :cond_0
    move-object v1, v3

    :cond_1
    return-object v1
.end method

.method public get(I)Lorg/apache/log4j/spi/LoggingEvent;
    .locals 2

    if-ltz p1, :cond_1

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    iget v1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    add-int/2addr v1, p1

    iget p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I

    rem-int/2addr v1, p1

    aget-object p1, v0, v1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getMaxSize()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I

    return v0
.end method

.method public length()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I

    return v0
.end method

.method public resize(I)V
    .locals 7

    if-ltz p1, :cond_5

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-array v1, p1, [Lorg/apache/log4j/spi/LoggingEvent;

    if-ge p1, v0, :cond_1

    move v0, p1

    :cond_1
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    .line 3
    iget-object v4, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    iget v5, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    aget-object v6, v4, v5

    aput-object v6, v1, v3

    const/4 v6, 0x0

    .line 4
    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    .line 5
    iput v5, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    iget v4, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I

    if-ne v5, v4, :cond_2

    .line 6
    iput v2, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 7
    :cond_3
    iput-object v1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    .line 8
    iput v2, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I

    .line 9
    iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I

    .line 10
    iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I

    if-ne v0, p1, :cond_4

    .line 11
    iput v2, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I

    goto :goto_1

    .line 12
    :cond_4
    iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I

    :goto_1
    return-void

    .line 13
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Negative array size ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string p1, "] not allowed."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
