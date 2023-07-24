.class public Lm/a/b/h/s;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SourceFile"


# instance fields
.field public final a:Lm/a/b/h/r;

.field public b:I

.field public c:J

.field public d:Lorg/apache/log4j/Level;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:[Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public final k:Ljava/lang/StringBuffer;


# direct methods
.method public constructor <init>(Lm/a/b/h/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iput-object v0, p0, Lm/a/b/h/s;->k:Ljava/lang/StringBuffer;

    .line 3
    iput-object p1, p0, Lm/a/b/h/s;->a:Lm/a/b/h/r;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 12

    .line 1
    iget-object v0, p0, Lm/a/b/h/s;->a:Lm/a/b/h/r;

    new-instance v11, Lm/a/b/h/j;

    iget-wide v2, p0, Lm/a/b/h/s;->c:J

    iget-object v4, p0, Lm/a/b/h/s;->d:Lorg/apache/log4j/Level;

    iget-object v5, p0, Lm/a/b/h/s;->e:Ljava/lang/String;

    iget-object v6, p0, Lm/a/b/h/s;->f:Ljava/lang/String;

    iget-object v7, p0, Lm/a/b/h/s;->g:Ljava/lang/String;

    iget-object v8, p0, Lm/a/b/h/s;->h:Ljava/lang/String;

    iget-object v9, p0, Lm/a/b/h/s;->i:[Ljava/lang/String;

    iget-object v10, p0, Lm/a/b/h/s;->j:Ljava/lang/String;

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lm/a/b/h/j;-><init>(JLorg/apache/log4j/Priority;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Lm/a/b/h/r;->a(Lm/a/b/h/j;)V

    .line 2
    iget v0, p0, Lm/a/b/h/s;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lm/a/b/h/s;->b:I

    return-void
.end method

.method public final b()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    iput-wide v0, p0, Lm/a/b/h/s;->c:J

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lm/a/b/h/s;->d:Lorg/apache/log4j/Level;

    .line 3
    iput-object v0, p0, Lm/a/b/h/s;->e:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lm/a/b/h/s;->f:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lm/a/b/h/s;->g:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lm/a/b/h/s;->h:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lm/a/b/h/s;->i:[Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lm/a/b/h/s;->j:Ljava/lang/String;

    return-void
.end method

.method public characters([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/a/b/h/s;->k:Ljava/lang/StringBuffer;

    invoke-static {p1, p2, p3}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string p1, "log4j:event"

    .line 1
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lm/a/b/h/s;->a()V

    .line 3
    invoke-virtual {p0}, Lm/a/b/h/s;->b()V

    goto :goto_1

    :cond_0
    const-string p1, "log4j:NDC"

    .line 4
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lm/a/b/h/s;->k:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/a/b/h/s;->f:Ljava/lang/String;

    goto :goto_1

    :cond_1
    const-string p1, "log4j:message"

    .line 6
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lm/a/b/h/s;->k:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/a/b/h/s;->h:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const-string p1, "log4j:throwable"

    .line 8
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 9
    new-instance p1, Ljava/util/StringTokenizer;

    iget-object p2, p0, Lm/a/b/h/s;->k:Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "\n\t"

    invoke-direct {p1, p2, p3}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Ljava/util/StringTokenizer;->countTokens()I

    move-result p2

    new-array p2, p2, [Ljava/lang/String;

    iput-object p2, p0, Lm/a/b/h/s;->i:[Ljava/lang/String;

    .line 11
    array-length p3, p2

    if-lez p3, :cond_3

    const/4 p3, 0x0

    .line 12
    invoke-virtual {p1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v0

    aput-object v0, p2, p3

    const/4 p2, 0x1

    .line 13
    :goto_0
    iget-object p3, p0, Lm/a/b/h/s;->i:[Ljava/lang/String;

    array-length v0, p3

    if-ge p2, v0, :cond_3

    .line 14
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "\t"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public startDocument()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lm/a/b/h/s;->b:I

    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lm/a/b/h/s;->k:Ljava/lang/StringBuffer;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->setLength(I)V

    const-string p1, "log4j:event"

    .line 2
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "thread"

    .line 3
    invoke-interface {p4, p1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/a/b/h/s;->g:Ljava/lang/String;

    const-string p1, "timestamp"

    .line 4
    invoke-interface {p4, p1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, Lm/a/b/h/s;->c:J

    const-string p1, "logger"

    .line 5
    invoke-interface {p4, p1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/a/b/h/s;->e:Ljava/lang/String;

    const-string p1, "level"

    .line 6
    invoke-interface {p4, p1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/log4j/Level;->toLevel(Ljava/lang/String;)Lorg/apache/log4j/Level;

    move-result-object p1

    iput-object p1, p0, Lm/a/b/h/s;->d:Lorg/apache/log4j/Level;

    goto :goto_0

    :cond_0
    const-string p1, "log4j:locationInfo"

    .line 7
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 8
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    const-string p2, "class"

    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, "."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, "method"

    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, "("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, "file"

    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, ":"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, "line"

    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/a/b/h/s;->j:Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method
