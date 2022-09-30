<?php $__env->startSection('content'); ?>

    <div class="row">
        <div class="col-lg-12">
            <h2 class="text-center">Product Management</h2>
        </div>
        <div class="col-lg-12 text-center" style="margin-top:10px;margin-bottom: 10px;">
            <a class="btn btn-success " href="<?php echo e(route('products.create')); ?>">
                 Add product</a>
        </div>
    </div>

    <?php if($message = Session::get('success')): ?>
        <div class="alert alert-success">
            <?php echo e($message); ?>

        </div>
    <?php endif; ?>

    <?php if(sizeof($products) > 0): ?>
        <table class="table table-bordered">
            <tr>
                <th>No</th>
                <th>Product Name</th>
                <th>Product Description</th>
                <th>Qty.</th>
                <th width="280px">More</th>
            </tr>
            <?php $__currentLoopData = $products; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $product): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
                <tr>
                    <td><?php echo e(++$i); ?></td>
                    <td><?php echo e($product->product_name); ?></td>
                    <td><?php echo e($product->product_desc); ?></td>
                    <td><?php echo e($product->product_qty); ?></td>
                    <td>
                        <form action="<?php echo e(route('products.destroy',$product->id)); ?>" 
                            method="POST">
                            <a class="btn btn-info" 
                            href="<?php echo e(route('products.show',$product->id)); ?>">Show</a>
                            <a class="btn btn-primary" 
                            href="<?php echo e(route('products.edit',$product->id)); ?>">Edit</a>
                            <?php echo csrf_field(); ?>
                            <?php echo method_field('DELETE'); ?>
                            <button type="submit" class="btn btn-danger">Delete</button>
                        </form>
                    </td>
                </tr>
            <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>
        </table>
    <?php else: ?>
        <div class="alert alert-alert">Start Adding to the Database.</div>
    <?php endif; ?>

    <?php echo $products->links(); ?>

<?php $__env->stopSection(); ?>

<?php echo $__env->make('products.layout', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\pro_management\pro_management\resources\views/products/index.blade.php ENDPATH**/ ?>