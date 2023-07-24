.class public abstract Lm/b/j/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lm/b/j/p0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm/b/j/h0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm/b/j/q0;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/StringBuilder;)V
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lm/b/j/i0;
    .locals 1

    .line 2
    move-object v0, p0

    check-cast v0, Lm/b/j/i0;

    return-object v0
.end method

.method public final b()Lm/b/j/j0;
    .locals 1

    .line 1
    move-object v0, p0

    check-cast v0, Lm/b/j/j0;

    return-object v0
.end method

.method public final c()Lm/b/j/k0;
    .locals 1

    .line 1
    move-object v0, p0

    check-cast v0, Lm/b/j/k0;

    return-object v0
.end method

.method public final d()Lm/b/j/m0;
    .locals 1

    .line 1
    move-object v0, p0

    check-cast v0, Lm/b/j/m0;

    return-object v0
.end method

.method public final e()Lm/b/j/n0;
    .locals 1

    .line 1
    move-object v0, p0

    check-cast v0, Lm/b/j/n0;

    return-object v0
.end method

.method public final f()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/q0;->a:Lm/b/j/p0;

    sget-object v1, Lm/b/j/p0;->f:Lm/b/j/p0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/q0;->a:Lm/b/j/p0;

    sget-object v1, Lm/b/j/p0;->e:Lm/b/j/p0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/q0;->a:Lm/b/j/p0;

    sget-object v1, Lm/b/j/p0;->b:Lm/b/j/p0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/q0;->a:Lm/b/j/p0;

    sget-object v1, Lm/b/j/p0;->g:Lm/b/j/p0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/q0;->a:Lm/b/j/p0;

    sget-object v1, Lm/b/j/p0;->d:Lm/b/j/p0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final k()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/j/q0;->a:Lm/b/j/p0;

    sget-object v1, Lm/b/j/p0;->c:Lm/b/j/p0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract l()Lm/b/j/q0;
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
