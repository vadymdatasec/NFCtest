.class public Lorg/apache/log4j/varia/LevelMatchFilter;
.super Lorg/apache/log4j/spi/Filter;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Lorg/apache/log4j/Level;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/spi/Filter;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->a:Z

    return-void
.end method


# virtual methods
.method public decide(Lorg/apache/log4j/spi/LoggingEvent;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->b:Lorg/apache/log4j/Level;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/apache/log4j/Priority;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3
    iget-boolean p1, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->a:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1

    :cond_2
    return v1
.end method

.method public getAcceptOnMatch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->a:Z

    return v0
.end method

.method public getLevelToMatch()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->b:Lorg/apache/log4j/Level;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public setAcceptOnMatch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->a:Z

    return-void
.end method

.method public setLevelToMatch(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Lorg/apache/log4j/helpers/OptionConverter;->toLevel(Ljava/lang/String;Lorg/apache/log4j/Level;)Lorg/apache/log4j/Level;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->b:Lorg/apache/log4j/Level;

    return-void
.end method
