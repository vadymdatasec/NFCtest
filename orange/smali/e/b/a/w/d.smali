.class public final Le/b/a/w/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[J

.field public c:[Ljava/io/File;

.field public d:[Ljava/io/File;

.field public e:Z

.field public f:Le/b/a/w/c;

.field public g:J

.field public final synthetic h:Le/b/a/w/f;


# direct methods
.method public constructor <init>(Le/b/a/w/f;Ljava/lang/String;)V
    .locals 6

    .line 2
    iput-object p1, p0, Le/b/a/w/d;->h:Le/b/a/w/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Le/b/a/w/d;->a:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Le/b/a/w/f;->b(Le/b/a/w/f;)I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Le/b/a/w/d;->b:[J

    .line 5
    invoke-static {p1}, Le/b/a/w/f;->b(Le/b/a/w/f;)I

    move-result v0

    new-array v0, v0, [Ljava/io/File;

    iput-object v0, p0, Le/b/a/w/d;->c:[Ljava/io/File;

    .line 6
    invoke-static {p1}, Le/b/a/w/f;->b(Le/b/a/w/f;)I

    move-result v0

    new-array v0, v0, [Ljava/io/File;

    iput-object v0, p0, Le/b/a/w/d;->d:[Ljava/io/File;

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 p2, 0x2e

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    const/4 v1, 0x0

    .line 9
    :goto_0
    invoke-static {p1}, Le/b/a/w/f;->b(Le/b/a/w/f;)I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    iget-object v2, p0, Le/b/a/w/d;->c:[Ljava/io/File;

    new-instance v3, Ljava/io/File;

    invoke-static {p1}, Le/b/a/w/f;->d(Le/b/a/w/f;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v3, v2, v1

    const-string v2, ".tmp"

    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    iget-object v2, p0, Le/b/a/w/d;->d:[Ljava/io/File;

    new-instance v3, Ljava/io/File;

    invoke-static {p1}, Le/b/a/w/f;->d(Le/b/a/w/f;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v3, v2, v1

    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Le/b/a/w/f;Ljava/lang/String;Le/b/a/w/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/b/a/w/d;-><init>(Le/b/a/w/f;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Le/b/a/w/d;J)J
    .locals 0

    .line 2
    iput-wide p1, p0, Le/b/a/w/d;->g:J

    return-wide p1
.end method

.method public static synthetic a(Le/b/a/w/d;Le/b/a/w/c;)Le/b/a/w/c;
    .locals 0

    .line 4
    iput-object p1, p0, Le/b/a/w/d;->f:Le/b/a/w/c;

    return-object p1
.end method

.method public static synthetic a(Le/b/a/w/d;[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    invoke-virtual {p0, p1}, Le/b/a/w/d;->b([Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Le/b/a/w/d;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Le/b/a/w/d;->e:Z

    return p1
.end method

.method public static synthetic a(Le/b/a/w/d;)[J
    .locals 0

    .line 1
    iget-object p0, p0, Le/b/a/w/d;->b:[J

    return-object p0
.end method

.method public static synthetic b(Le/b/a/w/d;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le/b/a/w/d;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Le/b/a/w/d;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/b/a/w/d;->g:J

    return-wide v0
.end method

.method public static synthetic d(Le/b/a/w/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Le/b/a/w/d;->e:Z

    return p0
.end method

.method public static synthetic e(Le/b/a/w/d;)Le/b/a/w/c;
    .locals 0

    .line 1
    iget-object p0, p0, Le/b/a/w/d;->f:Le/b/a/w/c;

    return-object p0
.end method


# virtual methods
.method public a(I)Ljava/io/File;
    .locals 1

    .line 11
    iget-object v0, p0, Le/b/a/w/d;->c:[Ljava/io/File;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final a([Ljava/lang/String;)Ljava/io/IOException;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected journal line: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    iget-object v1, p0, Le/b/a/w/d;->b:[J

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-wide v4, v1, v3

    const/16 v6, 0x20

    .line 8
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Ljava/io/File;
    .locals 1

    .line 7
    iget-object v0, p0, Le/b/a/w/d;->d:[Ljava/io/File;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final b([Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    array-length v0, p1

    iget-object v1, p0, Le/b/a/w/d;->h:Le/b/a/w/f;

    invoke-static {v1}, Le/b/a/w/f;->b(Le/b/a/w/f;)I

    move-result v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 3
    :goto_0
    :try_start_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 4
    iget-object v1, p0, Le/b/a/w/d;->b:[J

    aget-object v3, p1, v0

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    aput-wide v3, v1, v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 5
    :catch_0
    invoke-virtual {p0, p1}, Le/b/a/w/d;->a([Ljava/lang/String;)Ljava/io/IOException;

    throw v2

    .line 6
    :cond_1
    invoke-virtual {p0, p1}, Le/b/a/w/d;->a([Ljava/lang/String;)Ljava/io/IOException;

    throw v2
.end method