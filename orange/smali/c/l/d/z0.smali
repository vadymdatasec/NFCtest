.class public Lc/l/d/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/l/d/l2;


# instance fields
.field public final synthetic a:Lc/l/d/o1;


# direct methods
.method public constructor <init>(Lc/l/d/o1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/z0;->a:Lc/l/d/o1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lc/h/j/c;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/l/d/z0;->a:Lc/l/d/o1;

    invoke-virtual {v0, p1, p2}, Lc/l/d/o1;->b(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V

    :cond_0
    return-void
.end method

.method public b(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/z0;->a:Lc/l/d/o1;

    invoke-virtual {v0, p1, p2}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V

    return-void
.end method
