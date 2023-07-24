.class public Lorg/apache/log4j/helpers/BoundedFIFO;
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

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    .line 3
    iput v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I

    .line 4
    iput v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    .line 5
    iput p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I

    .line 6
    new-array p1, p1, [Lorg/apache/log4j/spi/LoggingEvent;

    iput-object p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->a:[Lorg/apache/log4j/spi/LoggingEvent;

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
.method public a(II)I
    .locals 0

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    return p1
.end method

.method public get()Lorg/apache/log4j/spi/LoggingEvent;
    .locals 4

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I

    aget-object v3, v0, v2

    .line 3
    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    .line 4
    iput v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I

    iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I

    if-ne v2, v0, :cond_1

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I

    .line 6
    :cond_1
    iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    return-object v3
.end method

.method public getMaxSize()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I

    return v0
.end method

.method public isFull()Z
    .locals 2

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    iget v1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public length()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    return v0
.end method

.method public put(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 3

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    iget v1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I

    if-eq v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I

    aput-object p1, v0, v2

    add-int/lit8 v2, v2, 0x1

    .line 3
    iput v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I

    if-ne v2, v1, :cond_0

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I

    .line 5
    :cond_0
    iget p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    :cond_1
    return-void
.end method

.method public declared-synchronized resize(I)V
    .locals 5

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    new-array v0, p1, [Lorg/apache/log4j/spi/LoggingEvent;

    .line 4
    iget v1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I

    iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I

    sub-int/2addr v1, v2

    .line 5
    invoke-virtual {p0, v1, p1}, Lorg/apache/log4j/helpers/BoundedFIFO;->a(II)I

    move-result v1

    .line 6
    iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    invoke-virtual {p0, v1, v2}, Lorg/apache/log4j/helpers/BoundedFIFO;->a(II)I

    move-result v1

    .line 7
    iget-object v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    iget v3, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I

    const/4 v4, 0x0

    invoke-static {v2, v3, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    if-ge v1, v2, :cond_1

    if-ge v1, p1, :cond_1

    .line 9
    iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    sub-int/2addr v2, v1

    sub-int v3, p1, v1

    .line 10
    invoke-virtual {p0, v2, v3}, Lorg/apache/log4j/helpers/BoundedFIFO;->a(II)I

    move-result v2

    .line 11
    iget-object v3, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    invoke-static {v3, v4, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 12
    :goto_0
    iput-object v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->a:[Lorg/apache/log4j/spi/LoggingEvent;

    .line 13
    iput p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I

    .line 14
    iput v4, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I

    add-int/2addr v1, v2

    .line 15
    iput v1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    .line 16
    iput v1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I

    if-ne v1, p1, :cond_2

    .line 17
    iput v4, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public wasEmpty()Z
    .locals 2

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public wasFull()Z
    .locals 3

    .line 1
    iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
