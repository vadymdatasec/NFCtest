.class public Lc/l/d/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/savedstate/SavedStateRegistry$b;


# instance fields
.field public final synthetic a:Lc/l/d/f0;


# direct methods
.method public constructor <init>(Lc/l/d/f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/c0;->a:Lc/l/d/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget-object v1, p0, Lc/l/d/c0;->a:Lc/l/d/f0;

    invoke-virtual {v1}, Lc/l/d/f0;->l()V

    .line 3
    iget-object v1, p0, Lc/l/d/c0;->a:Lc/l/d/f0;

    iget-object v1, v1, Lc/l/d/f0;->k:Lc/n/l;

    sget-object v2, Lc/n/g$a;->ON_STOP:Lc/n/g$a;

    invoke-virtual {v1, v2}, Lc/n/l;->a(Lc/n/g$a;)V

    .line 4
    iget-object v1, p0, Lc/l/d/c0;->a:Lc/l/d/f0;

    iget-object v1, v1, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v1}, Lc/l/d/p0;->l()Landroid/os/Parcelable;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "android:support:fragments"

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-object v0
.end method
