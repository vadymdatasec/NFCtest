.class public final synthetic Le/f/a/b/b/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/a;


# instance fields
.field public final a:Le/f/a/b/b/e;

.field public final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Le/f/a/b/b/e;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/b/b/a0;->a:Le/f/a/b/b/e;

    iput-object p2, p0, Le/f/a/b/b/a0;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le/f/a/b/b/a0;->a:Le/f/a/b/b/e;

    iget-object v1, p0, Le/f/a/b/b/a0;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1}, Le/f/a/b/b/e;->a(Landroid/os/Bundle;Le/f/a/b/h/g;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
