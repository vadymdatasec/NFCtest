.class public Le/a/a/c0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/a/a/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Le/a/a/a;)V
    .locals 12

    .line 9
    iget-object v2, p2, Le/a/a/a;->b:Ljava/lang/String;

    iget-wide v3, p2, Le/a/a/a;->c:J

    iget-wide v5, p2, Le/a/a/a;->d:J

    iget-wide v7, p2, Le/a/a/a;->e:J

    iget-wide v9, p2, Le/a/a/a;->f:J

    .line 10
    invoke-static {p2}, Le/a/a/c0/f;->a(Le/a/a/a;)Ljava/util/List;

    move-result-object v11

    move-object v0, p0

    move-object v1, p1

    .line 11
    invoke-direct/range {v0 .. v11}, Le/a/a/c0/f;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJJJ",
            "Ljava/util/List<",
            "Le/a/a/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/a/a/c0/f;->b:Ljava/lang/String;

    const-string p1, ""

    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, Le/a/a/c0/f;->c:Ljava/lang/String;

    .line 4
    iput-wide p3, p0, Le/a/a/c0/f;->d:J

    .line 5
    iput-wide p5, p0, Le/a/a/c0/f;->e:J

    .line 6
    iput-wide p7, p0, Le/a/a/c0/f;->f:J

    .line 7
    iput-wide p9, p0, Le/a/a/c0/f;->g:J

    .line 8
    iput-object p11, p0, Le/a/a/c0/f;->h:Ljava/util/List;

    return-void
.end method

.method public static a(Le/a/a/c0/g;)Le/a/a/c0/f;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-static {p0}, Le/a/a/c0/i;->b(Ljava/io/InputStream;)I

    move-result v0

    const v1, 0x20150306

    if-ne v0, v1, :cond_0

    .line 4
    invoke-static {p0}, Le/a/a/c0/i;->b(Le/a/a/c0/g;)Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-static {p0}, Le/a/a/c0/i;->b(Le/a/a/c0/g;)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-static {p0}, Le/a/a/c0/i;->c(Ljava/io/InputStream;)J

    move-result-wide v5

    .line 7
    invoke-static {p0}, Le/a/a/c0/i;->c(Ljava/io/InputStream;)J

    move-result-wide v7

    .line 8
    invoke-static {p0}, Le/a/a/c0/i;->c(Ljava/io/InputStream;)J

    move-result-wide v9

    .line 9
    invoke-static {p0}, Le/a/a/c0/i;->c(Ljava/io/InputStream;)J

    move-result-wide v11

    .line 10
    invoke-static {p0}, Le/a/a/c0/i;->a(Le/a/a/c0/g;)Ljava/util/List;

    move-result-object v13

    .line 11
    new-instance p0, Le/a/a/c0/f;

    move-object v2, p0

    invoke-direct/range {v2 .. v13}, Le/a/a/c0/f;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V

    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0
.end method

.method public static a(Le/a/a/a;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/a;",
            ")",
            "Ljava/util/List<",
            "Le/a/a/i;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/a/a/a;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object p0, p0, Le/a/a/a;->g:Ljava/util/Map;

    invoke-static {p0}, Le/a/a/c0/j;->b(Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a([B)Le/a/a/a;
    .locals 3

    .line 13
    new-instance v0, Le/a/a/a;

    invoke-direct {v0}, Le/a/a/a;-><init>()V

    .line 14
    iput-object p1, v0, Le/a/a/a;->a:[B

    .line 15
    iget-object p1, p0, Le/a/a/c0/f;->c:Ljava/lang/String;

    iput-object p1, v0, Le/a/a/a;->b:Ljava/lang/String;

    .line 16
    iget-wide v1, p0, Le/a/a/c0/f;->d:J

    iput-wide v1, v0, Le/a/a/a;->c:J

    .line 17
    iget-wide v1, p0, Le/a/a/c0/f;->e:J

    iput-wide v1, v0, Le/a/a/a;->d:J

    .line 18
    iget-wide v1, p0, Le/a/a/c0/f;->f:J

    iput-wide v1, v0, Le/a/a/a;->e:J

    .line 19
    iget-wide v1, p0, Le/a/a/c0/f;->g:J

    iput-wide v1, v0, Le/a/a/a;->f:J

    .line 20
    iget-object p1, p0, Le/a/a/c0/f;->h:Ljava/util/List;

    invoke-static {p1}, Le/a/a/c0/j;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, v0, Le/a/a/a;->g:Ljava/util/Map;

    .line 21
    iget-object p1, p0, Le/a/a/c0/f;->h:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, v0, Le/a/a/a;->h:Ljava/util/List;

    return-object v0
.end method

.method public a(Ljava/io/OutputStream;)Z
    .locals 2

    const v0, 0x20150306

    .line 22
    :try_start_0
    invoke-static {p1, v0}, Le/a/a/c0/i;->a(Ljava/io/OutputStream;I)V

    .line 23
    iget-object v0, p0, Le/a/a/c0/f;->b:Ljava/lang/String;

    invoke-static {p1, v0}, Le/a/a/c0/i;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Le/a/a/c0/f;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/a/a/c0/f;->c:Ljava/lang/String;

    :goto_0
    invoke-static {p1, v0}, Le/a/a/c0/i;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 25
    iget-wide v0, p0, Le/a/a/c0/f;->d:J

    invoke-static {p1, v0, v1}, Le/a/a/c0/i;->a(Ljava/io/OutputStream;J)V

    .line 26
    iget-wide v0, p0, Le/a/a/c0/f;->e:J

    invoke-static {p1, v0, v1}, Le/a/a/c0/i;->a(Ljava/io/OutputStream;J)V

    .line 27
    iget-wide v0, p0, Le/a/a/c0/f;->f:J

    invoke-static {p1, v0, v1}, Le/a/a/c0/i;->a(Ljava/io/OutputStream;J)V

    .line 28
    iget-wide v0, p0, Le/a/a/c0/f;->g:J

    invoke-static {p1, v0, v1}, Le/a/a/c0/i;->a(Ljava/io/OutputStream;J)V

    .line 29
    iget-object v0, p0, Le/a/a/c0/f;->h:Ljava/util/List;

    invoke-static {v0, p1}, Le/a/a/c0/i;->a(Ljava/util/List;Ljava/io/OutputStream;)V

    .line 30
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    .line 31
    invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    const/4 p1, 0x0

    return p1
.end method