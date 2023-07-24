.class public final synthetic Le/f/a/a/j/j0/j/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/k0/a;


# instance fields
.field public final a:Le/f/a/a/j/j0/j/s;

.field public final b:Le/f/a/a/j/g0/k;

.field public final c:Ljava/lang/Iterable;

.field public final d:Le/f/a/a/j/x;

.field public final e:I


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/g0/k;Ljava/lang/Iterable;Le/f/a/a/j/x;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/j/p;->a:Le/f/a/a/j/j0/j/s;

    iput-object p2, p0, Le/f/a/a/j/j0/j/p;->b:Le/f/a/a/j/g0/k;

    iput-object p3, p0, Le/f/a/a/j/j0/j/p;->c:Ljava/lang/Iterable;

    iput-object p4, p0, Le/f/a/a/j/j0/j/p;->d:Le/f/a/a/j/x;

    iput p5, p0, Le/f/a/a/j/j0/j/p;->e:I

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/g0/k;Ljava/lang/Iterable;Le/f/a/a/j/x;I)Le/f/a/a/j/k0/a;
    .locals 7

    new-instance v6, Le/f/a/a/j/j0/j/p;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Le/f/a/a/j/j0/j/p;-><init>(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/g0/k;Ljava/lang/Iterable;Le/f/a/a/j/x;I)V

    return-object v6
.end method


# virtual methods
.method public c()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Le/f/a/a/j/j0/j/p;->a:Le/f/a/a/j/j0/j/s;

    iget-object v1, p0, Le/f/a/a/j/j0/j/p;->b:Le/f/a/a/j/g0/k;

    iget-object v2, p0, Le/f/a/a/j/j0/j/p;->c:Ljava/lang/Iterable;

    iget-object v3, p0, Le/f/a/a/j/j0/j/p;->d:Le/f/a/a/j/x;

    iget v4, p0, Le/f/a/a/j/j0/j/p;->e:I

    invoke-static {v0, v1, v2, v3, v4}, Le/f/a/a/j/j0/j/s;->a(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/g0/k;Ljava/lang/Iterable;Le/f/a/a/j/x;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
