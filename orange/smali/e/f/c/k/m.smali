.class public final synthetic Le/f/c/k/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/r/a;


# instance fields
.field public final a:Le/f/c/k/p;

.field public final b:Le/f/c/k/e;


# direct methods
.method public constructor <init>(Le/f/c/k/p;Le/f/c/k/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/k/m;->a:Le/f/c/k/p;

    iput-object p2, p0, Le/f/c/k/m;->b:Le/f/c/k/e;

    return-void
.end method

.method public static a(Le/f/c/k/p;Le/f/c/k/e;)Le/f/c/r/a;
    .locals 1

    new-instance v0, Le/f/c/k/m;

    invoke-direct {v0, p0, p1}, Le/f/c/k/m;-><init>(Le/f/c/k/p;Le/f/c/k/e;)V

    return-object v0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le/f/c/k/m;->a:Le/f/c/k/p;

    iget-object v1, p0, Le/f/c/k/m;->b:Le/f/c/k/e;

    invoke-static {v0, v1}, Le/f/c/k/p;->a(Le/f/c/k/p;Le/f/c/k/e;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
