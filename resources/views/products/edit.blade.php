@extends('employees.layout')

@section('content')

    <div class="row">
        <div class="col-lg-12">
            <h2 class="text-center">Edit employee</h2>
        </div>
        <div class="col-lg-12 text-center" style="margin-top:10px;margin-bottom: 10px;">
            <a class="btn btn-primary" href="{{ route('employees.index') }}"> Back</a>
        </div>
    </div>

    @if ($errors->any())
        <div class="alert alert-danger">
            <strong>Whoops!</strong> There were some problems with your input.<br><br>
            <ul>
                @foreach ($errors->all() as $error)
                    <li>{{ $error }}</li>
                @endforeach
            </ul>
        </div>
    @endif

    <form action="{{ route('employees.update',$employee->id) }}" method="POST">
        @csrf
        @method('PUT')

        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12">
                <div class="form-group">
                    <strong>Employee Name:</strong>
                    <input type="text" name="employee_name" 
                    value="{{ $employee->employee_name }}"
                    class="form-control" placeholder="employee Name">
                </div>
            </div>
            <div class="col-xs-12 col-sm-12 col-md-12">
                <div class="form-group">
                    <strong>Employee Addrs:</strong>
                    <input type="text" name="employee_addrs" 
                    value="{{ $employee->employee_addrs }}"
                    class="form-control" placeholder="employee Addrs">
              
                </div>
            </div>
            <div class="col-xs-12 col-sm-12 col-md-12">
                <div class="form-group">
                    <strong>Employee Phone:</strong>
                    <input type="text" name="employee_phone" 
                    value="{{ $employee->employee_phone }}"
                    class="form-control" placeholder="employee Phone">
              
                </div>
            </div>
            <div class="col-xs-12 col-sm-12 col-md-12">
                <div class="form-group">
                    <strong>Employee Email:</strong>
                    <input type="text" name="employee_email" 
                    value="{{ $employee->employee_email }}"
                    class="form-control" placeholder="employee Email">
              
                </div>
            </div>
            <div class="col-xs-12 col-sm-12 col-md-12">
                <div class="form-group">
                    <strong>Employee Salay:</strong>
                    <input type="number" name="employee_salay" class="form-control" 
                    style="height:150px"
                    value="{{ $employee->employee_salay }}"  placeholder="employee Salay">
               
                </div>
            </div>
            <div class="col-xs-12 col-sm-12 col-md-12 text-center">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </div>

    </form>
@endsection