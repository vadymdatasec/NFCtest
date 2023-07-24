.class public Lorg/apache/log4j/helpers/SyslogWriter;
.super Ljava/io/Writer;
.source "SourceFile"


# instance fields
.field public b:Ljava/net/InetAddress;

.field public final c:I

.field public d:Ljava/net/DatagramSocket;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 6

    const-string v0, ". All logging will FAIL."

    .line 1
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    if-eqz p1, :cond_4

    const-string v1, "["

    .line 2
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    const/16 v2, 0x3a

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    invoke-virtual {p1, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    if-ne v4, v2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, -0x1

    goto :goto_2

    .line 3
    :cond_1
    :goto_1
    :try_start_0
    new-instance v2, Ljava/net/URL;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "http://"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 5
    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v4, 0x1

    sub-int/2addr v1, v4

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v5, 0x5d

    if-ne v1, v5, :cond_2

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v4

    invoke-virtual {p1, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 8
    :cond_2
    invoke-virtual {v2}, Ljava/net/URL;->getPort()I

    move-result v1
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    const-string v2, "Malformed URL: will attempt to interpret as InetAddress."

    .line 9
    invoke-static {v2, v1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :goto_2
    if-ne v1, v3, :cond_3

    const/16 v1, 0x202

    .line 10
    :cond_3
    iput v1, p0, Lorg/apache/log4j/helpers/SyslogWriter;->c:I

    .line 11
    :try_start_1
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/log4j/helpers/SyslogWriter;->b:Ljava/net/InetAddress;
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v1

    .line 12
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Could not find "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    :goto_3
    :try_start_2
    new-instance v1, Ljava/net/DatagramSocket;

    invoke-direct {v1}, Ljava/net/DatagramSocket;-><init>()V

    iput-object v1, p0, Lorg/apache/log4j/helpers/SyslogWriter;->d:Ljava/net/DatagramSocket;
    :try_end_2
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_2
    move-exception v1

    .line 14
    invoke-virtual {v1}, Ljava/net/SocketException;->printStackTrace()V

    .line 15
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Could not instantiate DatagramSocket to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    return-void

    .line 16
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "syslogHost"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/helpers/SyslogWriter;->d:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    :cond_0
    return-void
.end method

.method public flush()V
    .locals 0

    return-void
.end method

.method public write(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/helpers/SyslogWriter;->d:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/apache/log4j/helpers/SyslogWriter;->b:Ljava/net/InetAddress;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    .line 4
    array-length v0, p1

    const/16 v1, 0x400

    if-lt v0, v1, :cond_0

    const/16 v0, 0x400

    .line 5
    :cond_0
    new-instance v1, Ljava/net/DatagramPacket;

    iget-object v2, p0, Lorg/apache/log4j/helpers/SyslogWriter;->b:Ljava/net/InetAddress;

    iget v3, p0, Lorg/apache/log4j/helpers/SyslogWriter;->c:I

    invoke-direct {v1, p1, v0, v2, v3}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    .line 6
    iget-object p1, p0, Lorg/apache/log4j/helpers/SyslogWriter;->d:Ljava/net/DatagramSocket;

    invoke-virtual {p1, v1}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    :cond_1
    return-void
.end method

.method public write([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {p0, v0}, Lorg/apache/log4j/helpers/SyslogWriter;->write(Ljava/lang/String;)V

    return-void
.end method
