.class public Lm/b/k/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lm/b/k/s0;


# direct methods
.method public constructor <init>(Lm/b/k/s0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm/b/k/r0;->a:Lm/b/k/s0;

    return-void
.end method


# virtual methods
.method public a(Lm/b/i/t;)V
    .locals 4

    const/4 v0, 0x0

    move-object v1, p1

    const/4 v2, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 1
    iget-object v3, p0, Lm/b/k/r0;->a:Lm/b/k/s0;

    invoke-interface {v3, v1, v2}, Lm/b/k/s0;->b(Lm/b/i/t;I)V

    .line 2
    invoke-virtual {v1}, Lm/b/i/t;->d()I

    move-result v3

    if-lez v3, :cond_0

    .line 3
    invoke-virtual {v1, v0}, Lm/b/i/t;->a(I)Lm/b/i/t;

    move-result-object v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_0
    :goto_1
    invoke-virtual {v1}, Lm/b/i/t;->h()Lm/b/i/t;

    move-result-object v3

    if-nez v3, :cond_1

    if-lez v2, :cond_1

    .line 5
    iget-object v3, p0, Lm/b/k/r0;->a:Lm/b/k/s0;

    invoke-interface {v3, v1, v2}, Lm/b/k/s0;->a(Lm/b/i/t;I)V

    .line 6
    invoke-virtual {v1}, Lm/b/i/t;->m()Lm/b/i/t;

    move-result-object v1

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    .line 7
    :cond_1
    iget-object v3, p0, Lm/b/k/r0;->a:Lm/b/k/s0;

    invoke-interface {v3, v1, v2}, Lm/b/k/s0;->a(Lm/b/i/t;I)V

    if-ne v1, p1, :cond_2

    goto :goto_2

    .line 8
    :cond_2
    invoke-virtual {v1}, Lm/b/i/t;->h()Lm/b/i/t;

    move-result-object v1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method
