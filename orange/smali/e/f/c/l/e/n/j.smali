.class public Le/f/c/l/e/n/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final h:Ljava/util/logging/Logger;


# instance fields
.field public final b:Ljava/io/RandomAccessFile;

.field public c:I

.field public d:I

.field public e:Le/f/c/l/e/n/g;

.field public f:Le/f/c/l/e/n/g;

.field public final g:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Le/f/c/l/e/n/j;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/n/j;->h:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 2
    iput-object v0, p0, Le/f/c/l/e/n/j;->g:[B

    .line 3
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-static {p1}, Le/f/c/l/e/n/j;->a(Ljava/io/File;)V

    .line 5
    :cond_0
    invoke-static {p1}, Le/f/c/l/e/n/j;->b(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    .line 6
    invoke-virtual {p0}, Le/f/c/l/e/n/j;->c()V

    return-void
.end method

.method public static synthetic a(Le/f/c/l/e/n/j;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/f/c/l/e/n/j;->b(I)I

    move-result p0

    return p0
.end method

.method public static a([BI)I
    .locals 2

    .line 11
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    add-int/2addr v0, p0

    return v0
.end method

.method public static synthetic a(Le/f/c/l/e/n/j;)Ljava/io/RandomAccessFile;
    .locals 0

    .line 4
    iget-object p0, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Le/f/c/l/e/n/j;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic a(Le/f/c/l/e/n/j;I[BII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Le/f/c/l/e/n/j;->a(I[BII)V

    return-void
.end method

.method public static a(Ljava/io/File;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".tmp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-static {v0}, Le/f/c/l/e/n/j;->b(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v1

    const-wide/16 v2, 0x1000

    .line 17
    :try_start_0
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->setLength(J)V

    const-wide/16 v2, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/16 v2, 0x10

    new-array v2, v2, [B

    const/4 v3, 0x4

    new-array v3, v3, [I

    const/16 v4, 0x1000

    const/4 v5, 0x0

    aput v4, v3, v5

    const/4 v4, 0x1

    aput v5, v3, v4

    const/4 v4, 0x2

    aput v5, v3, v4

    const/4 v4, 0x3

    aput v5, v3, v4

    .line 19
    invoke-static {v2, v3}, Le/f/c/l/e/n/j;->a([B[I)V

    .line 20
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 22
    invoke-virtual {v0, p0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 23
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Rename failed!"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 24
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 25
    throw p0
.end method

.method public static a([BII)V
    .locals 2

    shr-int/lit8 v0, p2, 0x18

    int-to-byte v0, v0

    .line 5
    aput-byte v0, p0, p1

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x10

    int-to-byte v1, v1

    .line 6
    aput-byte v1, p0, v0

    add-int/lit8 v0, p1, 0x2

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    .line 7
    aput-byte v1, p0, v0

    add-int/lit8 p1, p1, 0x3

    int-to-byte p2, p2

    .line 8
    aput-byte p2, p0, p1

    return-void
.end method

.method public static varargs a([B[I)V
    .locals 4

    .line 9
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v3, p1, v1

    .line 10
    invoke-static {p0, v2, v3}, Le/f/c/l/e/n/j;->a([BII)V

    add-int/lit8 v2, v2, 0x4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b(Ljava/io/File;)Ljava/io/RandomAccessFile;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rwd"

    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    return-object p0

    .line 3
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(I)Le/f/c/l/e/n/g;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    .line 12
    sget-object p1, Le/f/c/l/e/n/g;->c:Le/f/c/l/e/n/g;

    return-object p1

    .line 13
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 14
    new-instance v0, Le/f/c/l/e/n/g;

    iget-object v1, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    invoke-direct {v0, p1, v1}, Le/f/c/l/e/n/g;-><init>(II)V

    return-object v0
.end method

.method public final a(I[BII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 26
    invoke-virtual {p0, p1}, Le/f/c/l/e/n/j;->b(I)I

    move-result p1

    add-int v0, p1, p4

    .line 27
    iget v1, p0, Le/f/c/l/e/n/j;->c:I

    if-gt v0, v1, :cond_0

    .line 28
    iget-object v0, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 29
    iget-object p1, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {p1, p2, p3, p4}, Ljava/io/RandomAccessFile;->readFully([BII)V

    goto :goto_0

    :cond_0
    sub-int/2addr v1, p1

    .line 30
    iget-object v0, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 31
    iget-object p1, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {p1, p2, p3, v1}, Ljava/io/RandomAccessFile;->readFully([BII)V

    .line 32
    iget-object p1, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x10

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 33
    iget-object p1, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    add-int/2addr p3, v1

    sub-int/2addr p4, v1

    invoke-virtual {p1, p2, p3, p4}, Ljava/io/RandomAccessFile;->readFully([BII)V

    :goto_0
    return-void
.end method

.method public declared-synchronized a(Le/f/c/l/e/n/i;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 34
    :try_start_0
    iget-object v0, p0, Le/f/c/l/e/n/j;->e:Le/f/c/l/e/n/g;

    iget v0, v0, Le/f/c/l/e/n/g;->a:I

    const/4 v1, 0x0

    .line 35
    :goto_0
    iget v2, p0, Le/f/c/l/e/n/j;->d:I

    if-ge v1, v2, :cond_0

    .line 36
    invoke-virtual {p0, v0}, Le/f/c/l/e/n/j;->a(I)Le/f/c/l/e/n/g;

    move-result-object v0

    .line 37
    new-instance v2, Le/f/c/l/e/n/h;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Le/f/c/l/e/n/h;-><init>(Le/f/c/l/e/n/j;Le/f/c/l/e/n/g;Le/f/c/l/e/n/f;)V

    iget v3, v0, Le/f/c/l/e/n/g;->b:I

    invoke-interface {p1, v2, v3}, Le/f/c/l/e/n/i;->a(Ljava/io/InputStream;I)V

    .line 38
    iget v2, v0, Le/f/c/l/e/n/g;->a:I

    add-int/lit8 v2, v2, 0x4

    iget v0, v0, Le/f/c/l/e/n/g;->b:I

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, Le/f/c/l/e/n/j;->b(I)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 39
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(I)I
    .locals 1

    .line 2
    iget v0, p0, Le/f/c/l/e/n/j;->c:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x10

    sub-int/2addr p1, v0

    :goto_0
    return p1
.end method

.method public final c()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 2
    iget-object v0, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Le/f/c/l/e/n/j;->g:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 3
    iget-object v0, p0, Le/f/c/l/e/n/j;->g:[B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le/f/c/l/e/n/j;->a([BI)I

    move-result v0

    iput v0, p0, Le/f/c/l/e/n/j;->c:I

    int-to-long v0, v0

    .line 4
    iget-object v2, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 5
    iget-object v0, p0, Le/f/c/l/e/n/j;->g:[B

    const/4 v1, 0x4

    invoke-static {v0, v1}, Le/f/c/l/e/n/j;->a([BI)I

    move-result v0

    iput v0, p0, Le/f/c/l/e/n/j;->d:I

    .line 6
    iget-object v0, p0, Le/f/c/l/e/n/j;->g:[B

    const/16 v1, 0x8

    invoke-static {v0, v1}, Le/f/c/l/e/n/j;->a([BI)I

    move-result v0

    .line 7
    iget-object v1, p0, Le/f/c/l/e/n/j;->g:[B

    const/16 v2, 0xc

    invoke-static {v1, v2}, Le/f/c/l/e/n/j;->a([BI)I

    move-result v1

    .line 8
    invoke-virtual {p0, v0}, Le/f/c/l/e/n/j;->a(I)Le/f/c/l/e/n/g;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/n/j;->e:Le/f/c/l/e/n/g;

    .line 9
    invoke-virtual {p0, v1}, Le/f/c/l/e/n/j;->a(I)Le/f/c/l/e/n/g;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/n/j;->f:Le/f/c/l/e/n/g;

    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "File is truncated. Expected length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/f/c/l/e/n/j;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", Actual length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    .line 11
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public declared-synchronized close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/f/c/l/e/n/j;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public l()I
    .locals 4

    .line 1
    iget v0, p0, Le/f/c/l/e/n/j;->d:I

    const/16 v1, 0x10

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/n/j;->f:Le/f/c/l/e/n/g;

    iget v2, v0, Le/f/c/l/e/n/g;->a:I

    iget-object v3, p0, Le/f/c/l/e/n/j;->e:Le/f/c/l/e/n/g;

    iget v3, v3, Le/f/c/l/e/n/g;->a:I

    if-lt v2, v3, :cond_1

    sub-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x4

    .line 3
    iget v0, v0, Le/f/c/l/e/n/g;->b:I

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2

    :cond_1
    add-int/lit8 v2, v2, 0x4

    .line 4
    iget v0, v0, Le/f/c/l/e/n/g;->b:I

    add-int/2addr v2, v0

    iget v0, p0, Le/f/c/l/e/n/j;->c:I

    add-int/2addr v2, v0

    sub-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    const-class v1, Le/f/c/l/e/n/j;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "fileLength="

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/c/l/e/n/j;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/c/l/e/n/j;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", first="

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/n/j;->e:Le/f/c/l/e/n/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", last="

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/l/e/n/j;->f:Le/f/c/l/e/n/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", element lengths=["

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    :try_start_0
    new-instance v1, Le/f/c/l/e/n/f;

    invoke-direct {v1, p0, v0}, Le/f/c/l/e/n/f;-><init>(Le/f/c/l/e/n/j;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0, v1}, Le/f/c/l/e/n/j;->a(Le/f/c/l/e/n/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 9
    sget-object v2, Le/f/c/l/e/n/j;->h:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v4, "read error"

    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const-string v1, "]]"

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
