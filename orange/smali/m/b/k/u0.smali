.class public Lm/b/k/u0;
.super Lm/b/k/b1;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lm/b/k/q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm/b/k/b1;-><init>()V

    .line 2
    iput-object p1, p0, Lm/b/k/b1;->a:Lm/b/k/q0;

    return-void
.end method


# virtual methods
.method public a(Lm/b/i/l;Lm/b/i/l;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Lm/b/i/l;->u()Lm/b/k/f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    if-eq v1, p2, :cond_0

    .line 2
    iget-object v2, p0, Lm/b/k/b1;->a:Lm/b/k/q0;

    invoke-virtual {v2, p1, v1}, Lm/b/k/q0;->a(Lm/b/i/l;Lm/b/i/l;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lm/b/k/b1;->a:Lm/b/k/q0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, ":has(%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
