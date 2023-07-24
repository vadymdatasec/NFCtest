.class public final synthetic Le/f/a/a/j/j0/j/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/k0/a;


# instance fields
.field public final a:Le/f/a/a/j/j0/j/w;


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/j/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/j/v;->a:Le/f/a/a/j/j0/j/w;

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/j/w;)Le/f/a/a/j/k0/a;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/j/v;

    invoke-direct {v0, p0}, Le/f/a/a/j/j0/j/v;-><init>(Le/f/a/a/j/j0/j/w;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/a/a/j/j0/j/v;->a:Le/f/a/a/j/j0/j/w;

    invoke-static {v0}, Le/f/a/a/j/j0/j/w;->a(Le/f/a/a/j/j0/j/w;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
