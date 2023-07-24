.class public Lc/l/d/a1;
.super Lc/l/d/q0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lc/l/d/o1;


# direct methods
.method public constructor <init>(Lc/l/d/o1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/a1;->b:Lc/l/d/o1;

    invoke-direct {p0}, Lc/l/d/q0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    iget-object p1, p0, Lc/l/d/a1;->b:Lc/l/d/o1;

    invoke-virtual {p1}, Lc/l/d/o1;->A()Lc/l/d/r0;

    move-result-object p1

    iget-object v0, p0, Lc/l/d/a1;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->A()Lc/l/d/r0;

    move-result-object v0

    invoke-virtual {v0}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lc/l/d/n0;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method
