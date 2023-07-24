.class public final synthetic Le/f/a/d/a/b/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/d/a/b/v;

.field public final c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/v;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/u;->b:Le/f/a/d/a/b/v;

    iput-object p2, p0, Le/f/a/d/a/b/u;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/u;->b:Le/f/a/d/a/b/v;

    iget-object v1, p0, Le/f/a/d/a/b/u;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Le/f/a/d/a/b/v;->a(Landroid/os/Bundle;)V

    return-void
.end method
