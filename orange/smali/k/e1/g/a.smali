.class public Lk/e1/g/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/y;


# instance fields
.field public b:Z

.field public final synthetic c:Ll/h;

.field public final synthetic d:Lk/e1/g/c;

.field public final synthetic e:Ll/g;


# direct methods
.method public constructor <init>(Lk/e1/g/b;Ll/h;Lk/e1/g/c;Ll/g;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lk/e1/g/a;->c:Ll/h;

    iput-object p3, p0, Lk/e1/g/a;->d:Lk/e1/g/c;

    iput-object p4, p0, Lk/e1/g/a;->e:Ll/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ll/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/g/a;->c:Ll/h;

    invoke-interface {v0}, Ll/y;->a()Ll/a0;

    move-result-object v0

    return-object v0
.end method

.method public b(Ll/f;J)J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iget-object v1, p0, Lk/e1/g/a;->c:Ll/h;

    invoke-interface {v1, p1, p2, p3}, Ll/y;->b(Ll/f;J)J

    move-result-wide p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v1, -0x1

    cmp-long v3, p2, v1

    if-nez v3, :cond_1

    .line 2
    iget-boolean p1, p0, Lk/e1/g/a;->b:Z

    if-nez p1, :cond_0

    .line 3
    iput-boolean v0, p0, Lk/e1/g/a;->b:Z

    .line 4
    iget-object p1, p0, Lk/e1/g/a;->e:Ll/g;

    invoke-interface {p1}, Ll/x;->close()V

    :cond_0
    return-wide v1

    .line 5
    :cond_1
    iget-object v0, p0, Lk/e1/g/a;->e:Ll/g;

    invoke-interface {v0}, Ll/g;->b()Ll/f;

    move-result-object v3

    invoke-virtual {p1}, Ll/f;->q()J

    move-result-wide v0

    sub-long v4, v0, p2

    move-object v2, p1

    move-wide v6, p2

    invoke-virtual/range {v2 .. v7}, Ll/f;->a(Ll/f;JJ)Ll/f;

    .line 6
    iget-object p1, p0, Lk/e1/g/a;->e:Ll/g;

    invoke-interface {p1}, Ll/g;->f()Ll/g;

    return-wide p2

    :catch_0
    move-exception p1

    .line 7
    iget-boolean p2, p0, Lk/e1/g/a;->b:Z

    if-nez p2, :cond_2

    .line 8
    iput-boolean v0, p0, Lk/e1/g/a;->b:Z

    .line 9
    iget-object p2, p0, Lk/e1/g/a;->d:Lk/e1/g/c;

    invoke-interface {p2}, Lk/e1/g/c;->a()V

    .line 10
    :cond_2
    throw p1
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lk/e1/g/a;->b:Z

    if-nez v0, :cond_0

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    invoke-static {p0, v0, v1}, Lk/e1/e;->a(Ll/y;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lk/e1/g/a;->b:Z

    .line 4
    iget-object v0, p0, Lk/e1/g/a;->d:Lk/e1/g/c;

    invoke-interface {v0}, Lk/e1/g/c;->a()V

    .line 5
    :cond_0
    iget-object v0, p0, Lk/e1/g/a;->c:Ll/h;

    invoke-interface {v0}, Ll/y;->close()V

    return-void
.end method
