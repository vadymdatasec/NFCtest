.class public Le/f/c/l/e/k/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/k/b;
.implements Le/f/c/l/e/l/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/l/a;)V
    .locals 1

    .line 1
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string v0, "Registered Firebase Analytics event receiver for breadcrumbs"

    invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    return-void
.end method
