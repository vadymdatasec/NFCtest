.class public Lc/b/k/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/h/n/x;


# instance fields
.field public final synthetic a:Lc/b/k/n0;


# direct methods
.method public constructor <init>(Lc/b/k/n0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/w;->a:Lc/b/k/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lc/h/n/u1;)Lc/h/n/u1;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lc/h/n/u1;->i()I

    move-result v0

    .line 2
    iget-object v1, p0, Lc/b/k/w;->a:Lc/b/k/n0;

    invoke-virtual {v1, v0}, Lc/b/k/n0;->l(I)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 3
    invoke-virtual {p2}, Lc/h/n/u1;->g()I

    move-result v0

    .line 4
    invoke-virtual {p2}, Lc/h/n/u1;->h()I

    move-result v2

    .line 5
    invoke-virtual {p2}, Lc/h/n/u1;->f()I

    move-result v3

    .line 6
    invoke-virtual {p2, v0, v1, v2, v3}, Lc/h/n/u1;->a(IIII)Lc/h/n/u1;

    move-result-object p2

    .line 7
    :cond_0
    invoke-static {p1, p2}, Lc/h/n/v0;->b(Landroid/view/View;Lc/h/n/u1;)Lc/h/n/u1;

    move-result-object p1

    return-object p1
.end method
