.class public Lorg/apache/log4j/TTCCLayout;
.super Lorg/apache/log4j/helpers/DateLayout;
.source "SourceFile"


# instance fields
.field public f:Z

.field public g:Z

.field public h:Z

.field public final i:Ljava/lang/StringBuffer;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/helpers/DateLayout;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->f:Z

    .line 3
    iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->g:Z

    .line 4
    iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->h:Z

    .line 5
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    const-string v0, "RELATIVE"

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Lorg/apache/log4j/helpers/DateLayout;->setDateFormat(Ljava/lang/String;Ljava/util/TimeZone;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Lorg/apache/log4j/helpers/DateLayout;-><init>()V

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->f:Z

    .line 9
    iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->g:Z

    .line 10
    iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->h:Z

    .line 11
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    .line 12
    invoke-virtual {p0, p1}, Lorg/apache/log4j/helpers/DateLayout;->setDateFormat(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/helpers/DateLayout;->dateFormat(Ljava/lang/StringBuffer;Lorg/apache/log4j/spi/LoggingEvent;)V

    .line 3
    iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->f:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 5
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 6
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 7
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;

    move-result-object v1

    invoke-virtual {v1}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 8
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 9
    iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->g:Z

    if-eqz v0, :cond_1

    .line 10
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 11
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 12
    :cond_1
    iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->h:Z

    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 14
    iget-object v2, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 15
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 16
    :cond_2
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    const-string v1, "- "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 17
    iget-object v0, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 18
    iget-object p1, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    sget-object v0, Lorg/apache/log4j/Layout;->LINE_SEP:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 19
    iget-object p1, p0, Lorg/apache/log4j/TTCCLayout;->i:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getCategoryPrefixing()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->g:Z

    return v0
.end method

.method public getContextPrinting()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->h:Z

    return v0
.end method

.method public getThreadPrinting()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->f:Z

    return v0
.end method

.method public ignoresThrowable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setCategoryPrefixing(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/TTCCLayout;->g:Z

    return-void
.end method

.method public setContextPrinting(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/TTCCLayout;->h:Z

    return-void
.end method

.method public setThreadPrinting(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/TTCCLayout;->f:Z

    return-void
.end method
