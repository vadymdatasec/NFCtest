.class public final synthetic Le/f/c/u/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/c/u/i;

.field public final c:Landroid/content/Intent;

.field public final d:Le/f/a/b/h/h;


# direct methods
.method public constructor <init>(Le/f/c/u/i;Landroid/content/Intent;Le/f/a/b/h/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/u/e;->b:Le/f/c/u/i;

    iput-object p2, p0, Le/f/c/u/e;->c:Landroid/content/Intent;

    iput-object p3, p0, Le/f/c/u/e;->d:Le/f/a/b/h/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le/f/c/u/e;->b:Le/f/c/u/i;

    iget-object v1, p0, Le/f/c/u/e;->c:Landroid/content/Intent;

    iget-object v2, p0, Le/f/c/u/e;->d:Le/f/a/b/h/h;

    invoke-virtual {v0, v1, v2}, Le/f/c/u/i;->a(Landroid/content/Intent;Le/f/a/b/h/h;)V

    return-void
.end method
