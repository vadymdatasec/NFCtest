.class public Lorg/apache/log4j/xml/XMLLayout;
.super Lorg/apache/log4j/Layout;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/StringBuffer;

.field public b:Z

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/Layout;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->b:Z

    .line 4
    iput-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->c:Z

    return-void
.end method


# virtual methods
.method public activateOptions()V
    .locals 0

    return-void
.end method

.method public format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->capacity()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x800

    if-le v0, v2, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v2, 0x100

    invoke-direct {v0, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 4
    :goto_0
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v2, "<log4j:event logger=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 5
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/apache/log4j/helpers/Transform;->escapeTags(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 6
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v2, "\" timestamp=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 7
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    iget-wide v2, p1, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 8
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v2, "\" level=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 9
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/apache/log4j/helpers/Transform;->escapeTags(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 10
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v2, "\" thread=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 11
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/apache/log4j/helpers/Transform;->escapeTags(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 12
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v2, "\">\r\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 13
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v2, "<log4j:message><![CDATA["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 14
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lorg/apache/log4j/helpers/Transform;->appendEscapingCDATA(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v2, "]]></log4j:message>\r\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 16
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 17
    iget-object v2, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v3, "<log4j:NDC><![CDATA["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 18
    iget-object v2, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-static {v2, v0}, Lorg/apache/log4j/helpers/Transform;->appendEscapingCDATA(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v2, "]]></log4j:NDC>\r\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 20
    :cond_1
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 21
    iget-object v2, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v3, "<log4j:throwable><![CDATA["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    .line 22
    :goto_1
    array-length v3, v0

    if-ge v2, v3, :cond_2

    .line 23
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    aget-object v4, v0, v2

    invoke-static {v3, v4}, Lorg/apache/log4j/helpers/Transform;->appendEscapingCDATA(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    .line 24
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v4, "\r\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 25
    :cond_2
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v2, "]]></log4j:throwable>\r\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 26
    :cond_3
    iget-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->b:Z

    const-string v2, "\"/>\r\n"

    if-eqz v0, :cond_4

    .line 27
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    move-result-object v0

    .line 28
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v4, "<log4j:locationInfo class=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 29
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Lorg/apache/log4j/spi/LocationInfo;->getClassName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lorg/apache/log4j/helpers/Transform;->escapeTags(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 30
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v4, "\" method=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 31
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Lorg/apache/log4j/spi/LocationInfo;->getMethodName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lorg/apache/log4j/helpers/Transform;->escapeTags(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 32
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v4, "\" file=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 33
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Lorg/apache/log4j/spi/LocationInfo;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lorg/apache/log4j/helpers/Transform;->escapeTags(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 34
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v4, "\" line=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 35
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Lorg/apache/log4j/spi/LocationInfo;->getLineNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 36
    iget-object v0, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 37
    :cond_4
    iget-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->c:Z

    if-eqz v0, :cond_7

    .line 38
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getPropertyKeySet()Ljava/util/Set;

    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v3

    if-lez v3, :cond_7

    .line 40
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v4, "<log4j:properties>\r\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 41
    invoke-interface {v0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v0

    .line 42
    invoke-static {v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 43
    :goto_2
    array-length v3, v0

    if-ge v1, v3, :cond_6

    .line 44
    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 45
    invoke-virtual {p1, v3}, Lorg/apache/log4j/spi/LoggingEvent;->getMDC(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 46
    iget-object v5, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v6, "<log4j:data name=\""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 47
    iget-object v5, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-static {v3}, Lorg/apache/log4j/helpers/Transform;->escapeTags(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 48
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v5, "\" value=\""

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 49
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lorg/apache/log4j/helpers/Transform;->escapeTags(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 50
    iget-object v3, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 51
    :cond_6
    iget-object p1, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v0, "</log4j:properties>\r\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 52
    :cond_7
    iget-object p1, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    const-string v0, "</log4j:event>\r\n\r\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 53
    iget-object p1, p0, Lorg/apache/log4j/xml/XMLLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getLocationInfo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->b:Z

    return v0
.end method

.method public getProperties()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->c:Z

    return v0
.end method

.method public ignoresThrowable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setLocationInfo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/xml/XMLLayout;->b:Z

    return-void
.end method

.method public setProperties(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/xml/XMLLayout;->c:Z

    return-void
.end method
