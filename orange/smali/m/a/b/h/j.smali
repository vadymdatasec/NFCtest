.class public Lm/a/b/h/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Lorg/apache/log4j/Priority;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLorg/apache/log4j/Priority;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lm/a/b/h/j;->a:J

    .line 3
    iput-object p3, p0, Lm/a/b/h/j;->b:Lorg/apache/log4j/Priority;

    .line 4
    iput-object p4, p0, Lm/a/b/h/j;->c:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lm/a/b/h/j;->d:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lm/a/b/h/j;->e:Ljava/lang/String;

    .line 7
    iput-object p7, p0, Lm/a/b/h/j;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 10

    .line 8
    iget-wide v1, p1, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;

    move-result-object v3

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    move-result-object p1

    iget-object p1, p1, Lorg/apache/log4j/spi/LocationInfo;->fullInfo:Ljava/lang/String;

    :goto_0
    move-object v9, p1

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lm/a/b/h/j;-><init>(JLorg/apache/log4j/Priority;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/a/b/h/j;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/a/b/h/j;->f:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/a/b/h/j;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lorg/apache/log4j/Priority;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/a/b/h/j;->b:Lorg/apache/log4j/Priority;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/a/b/h/j;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lm/a/b/h/j;->a:J

    return-wide v0
.end method
