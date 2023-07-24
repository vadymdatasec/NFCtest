.class public Le/c/a/o2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le/c/a/o2;->b:I

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    .line 8
    iget v0, p0, Le/c/a/o2;->b:I

    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, -0x1

    if-ne v0, v1, :cond_0

    return v2

    .line 9
    :cond_0
    iget v0, p0, Le/c/a/o2;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Le/c/a/o2;->b:I

    .line 10
    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 11
    iget-object v0, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v1, p0, Le/c/a/o2;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0

    :cond_1
    return v2
.end method

.method public a(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    invoke-virtual {p0}, Le/c/a/o2;->p()Z

    .line 2
    invoke-virtual {p0}, Le/c/a/o2;->f()Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public a(C)Z
    .locals 3

    .line 3
    iget v0, p0, Le/c/a/o2;->b:I

    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v1, p0, Le/c/a/o2;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 4
    iget v0, p0, Le/c/a/o2;->b:I

    add-int/2addr v0, v2

    iput v0, p0, Le/c/a/o2;->b:I

    :cond_1
    return p1
.end method

.method public a(I)Z
    .locals 1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    const/16 v0, 0xd

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public a(Ljava/lang/String;)Z
    .locals 4

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 6
    iget v1, p0, Le/c/a/o2;->b:I

    iget-object v2, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v0

    if-gt v1, v2, :cond_0

    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v2, p0, Le/c/a/o2;->b:I

    add-int v3, v2, v0

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 7
    iget v1, p0, Le/c/a/o2;->b:I

    add-int/2addr v1, v0

    iput v1, p0, Le/c/a/o2;->b:I

    :cond_1
    return p1
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Float;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    invoke-virtual {p0}, Le/c/a/o2;->p()Z

    .line 2
    invoke-virtual {p0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 3

    .line 11
    iget v0, p0, Le/c/a/o2;->b:I

    .line 12
    :goto_0
    invoke-virtual {p0}, Le/c/a/o2;->c()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v2, p0, Le/c/a/o2;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v1}, Le/c/a/o2;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 13
    :cond_0
    iget v1, p0, Le/c/a/o2;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Le/c/a/o2;->b:I

    goto :goto_0

    .line 14
    :cond_1
    :goto_1
    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v2, p0, Le/c/a/o2;->b:I

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 15
    iput v0, p0, Le/c/a/o2;->b:I

    return-object v1
.end method

.method public b(C)Ljava/lang/String;
    .locals 3

    .line 3
    invoke-virtual {p0}, Le/c/a/o2;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 4
    :cond_0
    iget-object v0, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v2, p0, Le/c/a/o2;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Le/c/a/o2;->b(I)Z

    move-result v2

    if-nez v2, :cond_4

    if-ne v0, p1, :cond_1

    goto :goto_2

    .line 6
    :cond_1
    iget v0, p0, Le/c/a/o2;->b:I

    .line 7
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v1

    :goto_0
    const/4 v2, -0x1

    if-eq v1, v2, :cond_3

    if-eq v1, p1, :cond_3

    .line 8
    invoke-virtual {p0, v1}, Le/c/a/o2;->b(I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 9
    :cond_2
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v1

    goto :goto_0

    .line 10
    :cond_3
    :goto_1
    iget-object p1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v1, p0, Le/c/a/o2;->b:I

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_2
    return-object v1
.end method

.method public b(I)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_0

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    const/16 v0, 0xd

    if-eq p1, v0, :cond_0

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public c()Z
    .locals 2

    .line 1
    iget v0, p0, Le/c/a/o2;->b:I

    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 3

    .line 1
    iget v0, p0, Le/c/a/o2;->b:I

    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    .line 2
    :cond_0
    iget-object v0, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v1, p0, Le/c/a/o2;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x61

    if-lt v0, v1, :cond_1

    const/16 v1, 0x7a

    if-le v0, v1, :cond_2

    :cond_1
    const/16 v1, 0x41

    if-lt v0, v1, :cond_3

    const/16 v1, 0x5a

    if-le v0, v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_0
    return v2
.end method

.method public e()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget v0, p0, Le/c/a/o2;->b:I

    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v1, p0, Le/c/a/o2;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Le/c/a/o2;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/Boolean;
    .locals 4

    .line 1
    iget v0, p0, Le/c/a/o2;->b:I

    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return-object v2

    .line 2
    :cond_0
    iget-object v0, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v1, p0, Le/c/a/o2;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    const/16 v3, 0x31

    if-eq v0, v1, :cond_2

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    return-object v2

    .line 3
    :cond_2
    :goto_0
    iget v1, p0, Le/c/a/o2;->b:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Le/c/a/o2;->b:I

    if-ne v0, v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    .line 4
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/Float;
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/c/a/o2;->o()I

    move-result v0

    .line 2
    iget v1, p0, Le/c/a/o2;->b:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_0
    iget-object v2, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 4
    iput v0, p0, Le/c/a/o2;->b:I

    return-object v1
.end method

.method public h()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Le/c/a/o2;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    iget v0, p0, Le/c/a/o2;->b:I

    .line 3
    iget-object v2, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    :goto_0
    const/16 v3, 0x61

    if-lt v2, v3, :cond_1

    const/16 v3, 0x7a

    if-le v2, v3, :cond_2

    :cond_1
    const/16 v3, 0x41

    if-lt v2, v3, :cond_3

    const/16 v3, 0x5a

    if-le v2, v3, :cond_2

    goto :goto_1

    .line 4
    :cond_2
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v2

    goto :goto_0

    .line 5
    :cond_3
    :goto_1
    iget v3, p0, Le/c/a/o2;->b:I

    .line 6
    :goto_2
    invoke-virtual {p0, v2}, Le/c/a/o2;->b(I)Z

    move-result v4

    if-nez v4, :cond_5

    const/16 v4, 0x28

    if-ne v2, v4, :cond_4

    .line 7
    iget v1, p0, Le/c/a/o2;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Le/c/a/o2;->b:I

    .line 8
    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 9
    :cond_4
    iput v0, p0, Le/c/a/o2;->b:I

    return-object v1

    .line 10
    :cond_5
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v2

    goto :goto_2
.end method

.method public i()Le/c/a/b0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Le/c/a/o2;->l()Le/c/a/x1;

    move-result-object v1

    if-nez v1, :cond_1

    .line 3
    new-instance v1, Le/c/a/b0;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    sget-object v2, Le/c/a/x1;->b:Le/c/a/x1;

    invoke-direct {v1, v0, v2}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    return-object v1

    .line 4
    :cond_1
    new-instance v2, Le/c/a/b0;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-direct {v2, v0, v1}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    return-object v2
.end method

.method public j()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Le/c/a/o2;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    iget v0, p0, Le/c/a/o2;->b:I

    .line 3
    iget-object v2, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x27

    if-eq v2, v3, :cond_1

    const/16 v3, 0x22

    if-eq v2, v3, :cond_1

    return-object v1

    .line 4
    :cond_1
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v3

    :goto_0
    const/4 v4, -0x1

    if-eq v3, v4, :cond_3

    if-ne v3, v2, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v3

    goto :goto_0

    :cond_3
    :goto_1
    if-ne v3, v4, :cond_4

    .line 6
    iput v0, p0, Le/c/a/o2;->b:I

    return-object v1

    .line 7
    :cond_4
    iget v1, p0, Le/c/a/o2;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Le/c/a/o2;->b:I

    .line 8
    iget-object v2, p0, Le/c/a/o2;->a:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    const/16 v0, 0x20

    .line 1
    invoke-virtual {p0, v0}, Le/c/a/o2;->b(C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()Le/c/a/x1;
    .locals 4

    .line 1
    invoke-virtual {p0}, Le/c/a/o2;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    iget-object v0, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v2, p0, Le/c/a/o2;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x25

    if-ne v0, v2, :cond_1

    .line 3
    iget v0, p0, Le/c/a/o2;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Le/c/a/o2;->b:I

    .line 4
    sget-object v0, Le/c/a/x1;->j:Le/c/a/x1;

    return-object v0

    .line 5
    :cond_1
    iget v0, p0, Le/c/a/o2;->b:I

    iget-object v2, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    if-le v0, v2, :cond_2

    return-object v1

    .line 6
    :cond_2
    :try_start_0
    iget-object v0, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v2, p0, Le/c/a/o2;->b:I

    iget v3, p0, Le/c/a/o2;->b:I

    add-int/lit8 v3, v3, 0x2

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/c/a/x1;->valueOf(Ljava/lang/String;)Le/c/a/x1;

    move-result-object v0

    .line 7
    iget v2, p0, Le/c/a/o2;->b:I

    add-int/lit8 v2, v2, 0x2

    iput v2, p0, Le/c/a/o2;->b:I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object v1
.end method

.method public m()Ljava/lang/Float;
    .locals 2

    .line 1
    iget v0, p0, Le/c/a/o2;->b:I

    .line 2
    invoke-virtual {p0}, Le/c/a/o2;->p()Z

    .line 3
    invoke-virtual {p0}, Le/c/a/o2;->g()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    .line 4
    :cond_0
    iput v0, p0, Le/c/a/o2;->b:I

    const/4 v0, 0x0

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/c/a/o2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget v0, p0, Le/c/a/o2;->b:I

    .line 3
    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iput v1, p0, Le/c/a/o2;->b:I

    .line 4
    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final o()I
    .locals 7

    .line 1
    invoke-virtual {p0}, Le/c/a/o2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Le/c/a/o2;->b:I

    return v0

    .line 3
    :cond_0
    iget v0, p0, Le/c/a/o2;->b:I

    .line 4
    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2b

    const/16 v3, 0x2d

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_2

    .line 5
    :cond_1
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v1

    .line 6
    :cond_2
    invoke-static {v1}, Ljava/lang/Character;->isDigit(I)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 7
    iget v1, p0, Le/c/a/o2;->b:I

    add-int/lit8 v1, v1, 0x1

    .line 8
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v4

    move v6, v4

    move v4, v1

    move v1, v6

    .line 9
    :goto_0
    invoke-static {v1}, Ljava/lang/Character;->isDigit(I)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    .line 10
    :cond_3
    iget v1, p0, Le/c/a/o2;->b:I

    add-int/lit8 v4, v1, 0x1

    .line 11
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v1

    goto :goto_0

    :cond_4
    move v4, v0

    :goto_1
    const/16 v5, 0x2e

    if-ne v1, v5, :cond_6

    .line 12
    iget v1, p0, Le/c/a/o2;->b:I

    add-int/lit8 v1, v1, 0x1

    .line 13
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v4

    move v6, v4

    move v4, v1

    move v1, v6

    .line 14
    :goto_2
    invoke-static {v1}, Ljava/lang/Character;->isDigit(I)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_3

    .line 15
    :cond_5
    iget v1, p0, Le/c/a/o2;->b:I

    add-int/lit8 v4, v1, 0x1

    .line 16
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v1

    goto :goto_2

    :cond_6
    :goto_3
    const/16 v5, 0x65

    if-eq v1, v5, :cond_7

    const/16 v5, 0x45

    if-ne v1, v5, :cond_b

    .line 17
    :cond_7
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v1

    if-eq v1, v3, :cond_8

    if-ne v1, v2, :cond_9

    .line 18
    :cond_8
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v1

    .line 19
    :cond_9
    invoke-static {v1}, Ljava/lang/Character;->isDigit(I)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 20
    iget v1, p0, Le/c/a/o2;->b:I

    add-int/lit8 v1, v1, 0x1

    .line 21
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v2

    move v4, v1

    .line 22
    :goto_4
    invoke-static {v2}, Ljava/lang/Character;->isDigit(I)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_5

    .line 23
    :cond_a
    iget v1, p0, Le/c/a/o2;->b:I

    add-int/lit8 v4, v1, 0x1

    .line 24
    invoke-virtual {p0}, Le/c/a/o2;->a()I

    move-result v2

    goto :goto_4

    .line 25
    :cond_b
    :goto_5
    iput v0, p0, Le/c/a/o2;->b:I

    return v4
.end method

.method public p()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/c/a/o2;->q()V

    .line 2
    iget v0, p0, Le/c/a/o2;->b:I

    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    .line 3
    :cond_0
    iget-object v0, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v1, p0, Le/c/a/o2;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_1

    return v2

    .line 4
    :cond_1
    iget v0, p0, Le/c/a/o2;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Le/c/a/o2;->b:I

    .line 5
    invoke-virtual {p0}, Le/c/a/o2;->q()V

    return v1
.end method

.method public q()V
    .locals 2

    .line 1
    :goto_0
    iget v0, p0, Le/c/a/o2;->b:I

    iget-object v1, p0, Le/c/a/o2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v0, v1, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Le/c/a/o2;->a:Ljava/lang/String;

    iget v1, p0, Le/c/a/o2;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v0}, Le/c/a/o2;->b(I)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_1
    return-void

    .line 3
    :cond_1
    iget v0, p0, Le/c/a/o2;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Le/c/a/o2;->b:I

    goto :goto_0
.end method
