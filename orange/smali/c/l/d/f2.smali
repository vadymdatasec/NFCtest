.class public Lc/l/d/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/l/d/l2;

.field public final synthetic c:Landroidx/fragment/app/Fragment;

.field public final synthetic d:Lc/h/j/c;


# direct methods
.method public constructor <init>(Lc/l/d/l2;Landroidx/fragment/app/Fragment;Lc/h/j/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/f2;->b:Lc/l/d/l2;

    iput-object p2, p0, Lc/l/d/f2;->c:Landroidx/fragment/app/Fragment;

    iput-object p3, p0, Lc/l/d/f2;->d:Lc/h/j/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/f2;->b:Lc/l/d/l2;

    iget-object v1, p0, Lc/l/d/f2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Lc/l/d/f2;->d:Lc/h/j/c;

    invoke-interface {v0, v1, v2}, Lc/l/d/l2;->a(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V

    return-void
.end method
