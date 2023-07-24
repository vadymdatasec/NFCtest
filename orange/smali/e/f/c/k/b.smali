.class public final synthetic Le/f/c/k/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/k/k;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/k/b;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/Object;)Le/f/c/k/k;
    .locals 1

    new-instance v0, Le/f/c/k/b;

    invoke-direct {v0, p0}, Le/f/c/k/b;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a(Le/f/c/k/f;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/c/k/b;->a:Ljava/lang/Object;

    invoke-static {v0, p1}, Le/f/c/k/e;->b(Ljava/lang/Object;Le/f/c/k/f;)Ljava/lang/Object;

    return-object v0
.end method
