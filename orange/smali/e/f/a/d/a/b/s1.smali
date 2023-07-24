.class public final synthetic Le/f/a/d/a/b/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/d/a/b/t1;

.field public final c:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/t1;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/s1;->b:Le/f/a/d/a/b/t1;

    iput-object p2, p0, Le/f/a/d/a/b/s1;->c:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/s1;->b:Le/f/a/d/a/b/t1;

    iget-object v1, p0, Le/f/a/d/a/b/s1;->c:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Le/f/a/d/a/b/t1;->a(Landroid/content/Intent;)V

    return-void
.end method
