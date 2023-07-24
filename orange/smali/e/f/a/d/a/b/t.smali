.class public final synthetic Le/f/a/d/a/b/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/d/a/b/v;

.field public final c:Landroid/os/Bundle;

.field public final d:Le/f/a/d/a/b/b;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/v;Landroid/os/Bundle;Le/f/a/d/a/b/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/t;->b:Le/f/a/d/a/b/v;

    iput-object p2, p0, Le/f/a/d/a/b/t;->c:Landroid/os/Bundle;

    iput-object p3, p0, Le/f/a/d/a/b/t;->d:Le/f/a/d/a/b/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/t;->b:Le/f/a/d/a/b/v;

    iget-object v1, p0, Le/f/a/d/a/b/t;->c:Landroid/os/Bundle;

    iget-object v2, p0, Le/f/a/d/a/b/t;->d:Le/f/a/d/a/b/b;

    invoke-virtual {v0, v1, v2}, Le/f/a/d/a/b/v;->a(Landroid/os/Bundle;Le/f/a/d/a/b/b;)V

    return-void
.end method
