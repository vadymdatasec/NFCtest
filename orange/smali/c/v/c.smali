.class public Lc/v/c;
.super Lc/v/s0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/v/s0;-><init>()V

    .line 2
    invoke-virtual {p0}, Lc/v/c;->t()V

    return-void
.end method


# virtual methods
.method public final t()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lc/v/s0;->b(I)Lc/v/s0;

    .line 2
    new-instance v1, Lc/v/r;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lc/v/r;-><init>(I)V

    invoke-virtual {p0, v1}, Lc/v/s0;->a(Lc/v/k0;)Lc/v/s0;

    new-instance v1, Lc/v/o;

    invoke-direct {v1}, Lc/v/o;-><init>()V

    .line 3
    invoke-virtual {p0, v1}, Lc/v/s0;->a(Lc/v/k0;)Lc/v/s0;

    new-instance v1, Lc/v/r;

    invoke-direct {v1, v0}, Lc/v/r;-><init>(I)V

    .line 4
    invoke-virtual {p0, v1}, Lc/v/s0;->a(Lc/v/k0;)Lc/v/s0;

    return-void
.end method
