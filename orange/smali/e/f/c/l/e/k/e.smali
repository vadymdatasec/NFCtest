.class public Le/f/c/l/e/k/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/k/a;


# instance fields
.field public final a:Le/f/c/j/a/c;


# direct methods
.method public constructor <init>(Le/f/c/j/a/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/k/e;->a:Le/f/c/j/a/c;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/c/l/e/k/e;->a:Le/f/c/j/a/c;

    const-string v1, "clx"

    invoke-interface {v0, v1, p1, p2}, Le/f/c/j/a/c;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
