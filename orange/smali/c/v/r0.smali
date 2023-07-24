.class public Lc/v/r0;
.super Lc/v/l0;
.source "SourceFile"


# instance fields
.field public a:Lc/v/s0;


# direct methods
.method public constructor <init>(Lc/v/s0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/v/l0;-><init>()V

    .line 2
    iput-object p1, p0, Lc/v/r0;->a:Lc/v/s0;

    return-void
.end method


# virtual methods
.method public c(Lc/v/k0;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/v/r0;->a:Lc/v/s0;

    iget-boolean v0, p1, Lc/v/s0;->N:Z

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lc/v/k0;->p()V

    .line 3
    iget-object p1, p0, Lc/v/r0;->a:Lc/v/s0;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lc/v/s0;->N:Z

    :cond_0
    return-void
.end method

.method public d(Lc/v/k0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/v/r0;->a:Lc/v/s0;

    iget v1, v0, Lc/v/s0;->M:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lc/v/s0;->M:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, v0, Lc/v/s0;->N:Z

    .line 3
    invoke-virtual {v0}, Lc/v/k0;->a()V

    .line 4
    :cond_0
    invoke-virtual {p1, p0}, Lc/v/k0;->b(Lc/v/j0;)Lc/v/k0;

    return-void
.end method
