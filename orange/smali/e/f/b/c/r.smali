.class public final Le/f/b/c/r;
.super Le/f/b/c/f;
.source "SourceFile"


# instance fields
.field public final a:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/b/c/f;-><init>()V

    .line 3
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    iput-object p1, p0, Le/f/b/c/r;->a:Ljava/io/File;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Le/f/b/c/o;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/b/c/r;-><init>(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public a()[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Le/f/b/c/m;->c()Le/f/b/c/m;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Le/f/b/c/r;->b()Ljava/io/FileInputStream;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/b/c/m;->a(Ljava/io/Closeable;)Ljava/io/Closeable;

    check-cast v1, Ljava/io/FileInputStream;

    .line 3
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Le/f/b/c/h;->a(Ljava/io/InputStream;J)[B

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-virtual {v0}, Le/f/b/c/m;->close()V

    return-object v1

    :catchall_0
    move-exception v1

    .line 5
    :try_start_1
    invoke-virtual {v0, v1}, Le/f/b/c/m;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v0, 0x0

    throw v0

    :catchall_1
    move-exception v1

    .line 6
    invoke-virtual {v0}, Le/f/b/c/m;->close()V

    .line 7
    throw v1
.end method

.method public b()Ljava/io/FileInputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Le/f/b/c/r;->a:Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/b/c/r;->a:Ljava/io/File;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Files.asByteSource("

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
