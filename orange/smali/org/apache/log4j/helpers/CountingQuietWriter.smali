.class public Lorg/apache/log4j/helpers/CountingQuietWriter;
.super Lorg/apache/log4j/helpers/QuietWriter;
.source "SourceFile"


# instance fields
.field public c:J


# direct methods
.method public constructor <init>(Ljava/io/Writer;Lorg/apache/log4j/spi/ErrorHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/log4j/helpers/QuietWriter;-><init>(Ljava/io/Writer;Lorg/apache/log4j/spi/ErrorHandler;)V

    return-void
.end method


# virtual methods
.method public getCount()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/log4j/helpers/CountingQuietWriter;->c:J

    return-wide v0
.end method

.method public setCount(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/log4j/helpers/CountingQuietWriter;->c:J

    return-void
.end method

.method public write(Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterWriter;->out:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 2
    iget-wide v0, p0, Lorg/apache/log4j/helpers/CountingQuietWriter;->c:J

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/log4j/helpers/CountingQuietWriter;->c:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/helpers/QuietWriter;->b:Lorg/apache/log4j/spi/ErrorHandler;

    const/4 v1, 0x1

    const-string v2, "Write failure."

    invoke-interface {v0, v2, p1, v1}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V

    :goto_0
    return-void
.end method
