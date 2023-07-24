.class public abstract Lk/e1/j/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/y;


# instance fields
.field public final b:Ll/l;

.field public c:Z

.field public d:J

.field public final synthetic e:Lk/e1/j/h;


# direct methods
.method public constructor <init>(Lk/e1/j/h;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lk/e1/j/b;->e:Lk/e1/j/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ll/l;

    iget-object v0, p0, Lk/e1/j/b;->e:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->c:Ll/h;

    invoke-interface {v0}, Ll/y;->a()Ll/a0;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/l;-><init>(Ll/a0;)V

    iput-object p1, p0, Lk/e1/j/b;->b:Ll/l;

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lk/e1/j/b;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Lk/e1/j/h;Lk/e1/j/a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lk/e1/j/b;-><init>(Lk/e1/j/h;)V

    return-void
.end method


# virtual methods
.method public a()Ll/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/j/b;->b:Ll/l;

    return-object v0
.end method

.method public final a(ZLjava/io/IOException;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lk/e1/j/b;->e:Lk/e1/j/h;

    iget v1, v0, Lk/e1/j/h;->e:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x5

    if-ne v1, v3, :cond_2

    .line 3
    iget-object v1, p0, Lk/e1/j/b;->b:Ll/l;

    invoke-virtual {v0, v1}, Lk/e1/j/h;->a(Ll/l;)V

    .line 4
    iget-object v5, p0, Lk/e1/j/b;->e:Lk/e1/j/h;

    iput v2, v5, Lk/e1/j/h;->e:I

    .line 5
    iget-object v3, v5, Lk/e1/j/h;->b:Lk/e1/h/h;

    if-eqz v3, :cond_1

    xor-int/lit8 v4, p1, 0x1

    .line 6
    iget-wide v6, p0, Lk/e1/j/b;->d:J

    move-object v8, p2

    invoke-virtual/range {v3 .. v8}, Lk/e1/h/h;->a(ZLk/e1/i/d;JLjava/io/IOException;)V

    :cond_1
    return-void

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lk/e1/j/b;->e:Lk/e1/j/h;

    iget v0, v0, Lk/e1/j/h;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ll/f;J)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lk/e1/j/b;->e:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->c:Ll/h;

    invoke-interface {v0, p1, p2, p3}, Ll/y;->b(Ll/f;J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-lez p3, :cond_0

    .line 2
    iget-wide v0, p0, Lk/e1/j/b;->d:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lk/e1/j/b;->d:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-wide p1

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    .line 3
    invoke-virtual {p0, p2, p1}, Lk/e1/j/b;->a(ZLjava/io/IOException;)V

    .line 4
    throw p1
.end method
