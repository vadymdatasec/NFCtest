.class public Lorg/apache/log4j/varia/LevelRangeFilter;
.super Lorg/apache/log4j/spi/Filter;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Lorg/apache/log4j/Level;

.field public c:Lorg/apache/log4j/Level;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/spi/Filter;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->a:Z

    return-void
.end method


# virtual methods
.method public decide(Lorg/apache/log4j/spi/LoggingEvent;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->b:Lorg/apache/log4j/Level;

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;

    move-result-object v0

    iget-object v2, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->b:Lorg/apache/log4j/Level;

    invoke-virtual {v0, v2}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->c:Lorg/apache/log4j/Level;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;

    move-result-object p1

    invoke-virtual {p1}, Lorg/apache/log4j/Priority;->toInt()I

    move-result p1

    iget-object v0, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->c:Lorg/apache/log4j/Level;

    invoke-virtual {v0}, Lorg/apache/log4j/Priority;->toInt()I

    move-result v0

    if-le p1, v0, :cond_1

    return v1

    .line 5
    :cond_1
    iget-boolean p1, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->a:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public getAcceptOnMatch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->a:Z

    return v0
.end method

.method public getLevelMax()Lorg/apache/log4j/Level;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->c:Lorg/apache/log4j/Level;

    return-object v0
.end method

.method public getLevelMin()Lorg/apache/log4j/Level;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->b:Lorg/apache/log4j/Level;

    return-object v0
.end method

.method public setAcceptOnMatch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->a:Z

    return-void
.end method

.method public setLevelMax(Lorg/apache/log4j/Level;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->c:Lorg/apache/log4j/Level;

    return-void
.end method

.method public setLevelMin(Lorg/apache/log4j/Level;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->b:Lorg/apache/log4j/Level;

    return-void
.end method
