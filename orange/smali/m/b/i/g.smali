.class public Lm/b/i/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public b:Lm/b/i/o;

.field public c:Ljava/nio/charset/Charset;

.field public d:Z

.field public e:Z

.field public f:I

.field public g:Lm/b/i/f;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lm/b/i/o;->g:Lm/b/i/o;

    iput-object v0, p0, Lm/b/i/g;->b:Lm/b/i/o;

    const-string v0, "UTF-8"

    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    iput-object v0, p0, Lm/b/i/g;->c:Ljava/nio/charset/Charset;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lm/b/i/g;->d:Z

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lm/b/i/g;->e:Z

    .line 6
    iput v0, p0, Lm/b/i/g;->f:I

    .line 7
    sget-object v0, Lm/b/i/f;->b:Lm/b/i/f;

    iput-object v0, p0, Lm/b/i/g;->g:Lm/b/i/f;

    return-void
.end method


# virtual methods
.method public a()Ljava/nio/charset/Charset;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/g;->c:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lm/b/i/g;
    .locals 0

    .line 3
    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/i/g;->a(Ljava/nio/charset/Charset;)Lm/b/i/g;

    return-object p0
.end method

.method public a(Ljava/nio/charset/Charset;)Lm/b/i/g;
    .locals 0

    .line 2
    iput-object p1, p0, Lm/b/i/g;->c:Ljava/nio/charset/Charset;

    return-object p0
.end method

.method public a(Lm/b/i/f;)Lm/b/i/g;
    .locals 0

    .line 4
    iput-object p1, p0, Lm/b/i/g;->g:Lm/b/i/f;

    return-object p0
.end method

.method public b()Ljava/nio/charset/CharsetEncoder;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/g;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lm/b/i/g;->clone()Lm/b/i/g;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lm/b/i/g;
    .locals 2

    .line 2
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/g;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    iget-object v1, p0, Lm/b/i/g;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm/b/i/g;->a(Ljava/lang/String;)Lm/b/i/g;

    .line 4
    iget-object v1, p0, Lm/b/i/g;->b:Lm/b/i/o;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm/b/i/o;->valueOf(Ljava/lang/String;)Lm/b/i/o;

    move-result-object v1

    iput-object v1, v0, Lm/b/i/g;->b:Lm/b/i/o;

    return-object v0

    :catch_0
    move-exception v0

    .line 5
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public d()Lm/b/i/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/g;->b:Lm/b/i/o;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lm/b/i/g;->f:I

    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/i/g;->e:Z

    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/i/g;->d:Z

    return v0
.end method

.method public h()Lm/b/i/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/g;->g:Lm/b/i/f;

    return-object v0
.end method
