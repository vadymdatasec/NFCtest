.class public Lc/l/d/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/a/j/b;


# instance fields
.field public final synthetic a:Lc/l/d/f0;


# direct methods
.method public constructor <init>(Lc/l/d/f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/d0;->a:Lc/l/d/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/l/d/d0;->a:Lc/l/d/f0;

    iget-object p1, p1, Lc/l/d/f0;->j:Lc/l/d/p0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lc/l/d/p0;->a(Landroidx/fragment/app/Fragment;)V

    .line 2
    iget-object p1, p0, Lc/l/d/d0;->a:Lc/l/d/f0;

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->c()Landroidx/savedstate/SavedStateRegistry;

    move-result-object p1

    const-string v0, "android:support:fragments"

    .line 3
    invoke-virtual {p1, v0}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lc/l/d/d0;->a:Lc/l/d/f0;

    iget-object v0, v0, Lc/l/d/f0;->j:Lc/l/d/p0;

    invoke-virtual {v0, p1}, Lc/l/d/p0;->a(Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method
