.class public final synthetic Le/f/a/a/j/j0/j/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/k0/a;


# instance fields
.field public final a:Le/f/a/a/j/j0/j/s;

.field public final b:Le/f/a/a/j/x;

.field public final c:I


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/j/r;->a:Le/f/a/a/j/j0/j/s;

    iput-object p2, p0, Le/f/a/a/j/j0/j/r;->b:Le/f/a/a/j/x;

    iput p3, p0, Le/f/a/a/j/j0/j/r;->c:I

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;I)Le/f/a/a/j/k0/a;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/j/r;

    invoke-direct {v0, p0, p1, p2}, Le/f/a/a/j/j0/j/r;-><init>(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;I)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Le/f/a/a/j/j0/j/r;->a:Le/f/a/a/j/j0/j/s;

    iget-object v1, p0, Le/f/a/a/j/j0/j/r;->b:Le/f/a/a/j/x;

    iget v2, p0, Le/f/a/a/j/j0/j/r;->c:I

    invoke-static {v0, v1, v2}, Le/f/a/a/j/j0/j/s;->a(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
